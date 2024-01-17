package com.rtz.evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rts.evaluation.model.Quiz;
import com.rts.evaluation.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository repo;
	
	public boolean addQuiz(Quiz bean) {
		repo.addQuiz(bean);
		return true;
	}
}

