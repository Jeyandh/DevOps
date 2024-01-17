package com.rts.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.model.Quiz;
import com.rtz.evaluation.service.QuizService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/productRest/api")
public class QuizController {
	
	@Autowired
	QuizService service;
	
	@PostMapping("/quiz")
	public boolean performInsert(@RequestBody Quiz bean) {
		return service.addQuiz(bean);
	}
}

