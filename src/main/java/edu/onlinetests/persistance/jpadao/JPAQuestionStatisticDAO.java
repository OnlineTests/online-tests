package edu.onlinetests.persistance.jpadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;
import edu.onlinetests.persistance.PersistanceManager;
import edu.onlinetests.persistance.QuestionStatisticDAO;

@Component
public class JPAQuestionStatisticDAO implements QuestionStatisticDAO {

	private PersistanceManager persistanceManager;

	@Autowired
	public JPAQuestionStatisticDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<Question, QuestionStatistic> getQuestionStatisticsOfCategory(
			Category category) {
		Query query = persistanceManager.getEntityManager()
				.createQuery(
						"select qs from QuestionStatistic qs where qs.question.category=:category ");
		query.setParameter("category", category);

		List<QuestionStatistic> list = query.getResultList();

		Map<Question, QuestionStatistic> map = new HashMap<Question, QuestionStatistic>();
		for (QuestionStatistic qs : list)
			map.put(qs.getQuestion(), qs);
		return map;
	}

	@Override
	public void storeQuestionStatistic(QuestionStatistic questionStatistic) {
		EntityManager em = persistanceManager.getEntityManager();
		em.getTransaction().begin();
		QuestionStatistic newQuestionStatistic = em.merge(questionStatistic);
		em.getTransaction().commit();
		em.close();
		if(questionStatistic.getQuestion().getQuestionStatistic() == null) {
			updateIdUsingJDBC(newQuestionStatistic);
		}
	}

	private void updateIdUsingJDBC(QuestionStatistic questionStatistic) {
		Properties credentials = persistanceManager.getCredentials();
		try {
			Connection connection = DriverManager.getConnection((String)credentials.get("url"), (String)credentials.get("user"), (String)credentials.get("password"));
			String sql = "UPDATE `Question_Statistic` SET questionId=" + questionStatistic.getQuestion().getQuestionId()
					+ " WHERE statisticId=" + questionStatistic.getStatisticId();
			connection.createStatement().executeUpdate(sql);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
