package edu.onlinetests.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;

@Service(value = "questionService")
public interface QuestionService {

	List<Question> getQuestionsOfCategory(Category category);
	
}
