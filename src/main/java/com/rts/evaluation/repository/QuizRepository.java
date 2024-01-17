package com.rts.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.model.Quiz;

@Repository
public class QuizRepository {
	
	List<Quiz> quizList=new ArrayList<Quiz>();
	public boolean addQuiz(Quiz bean) {
		
		quizList.add(bean);
		return true;
	}
}

