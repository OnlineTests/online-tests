package edu.onlinetests.backend.persistance.jpadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistance.PersistanceManager;
import edu.onlinetests.backend.persistance.QuestionStatisticDAO;
import edu.onlinetests.model.QuestionStatistic;

@Component
public class JPAQuestionStatisticDAO implements QuestionStatisticDAO {

	private PersistanceManager persistanceManager;

	@Autowired
	public JPAQuestionStatisticDAO(PersistanceManager persistanceManager) {
		this.persistanceManager = persistanceManager;
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
