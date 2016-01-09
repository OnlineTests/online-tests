package edu.onlinetests.persistance;

import java.util.List;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;

public interface QuestionDAO {

	List<Question> getQuestionsOfCategory(Category category);
	
}
