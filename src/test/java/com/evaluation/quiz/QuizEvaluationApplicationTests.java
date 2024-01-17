package com.evaluation.quiz;

import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.rts.evaluation.model.Quiz;
import com.rts.evaluation.repository.QuizRepository;
import com.rtz.onlinequizrest.QuizEvaluationApplication;

@ContextConfiguration(classes = QuizEvaluationApplication.class)
@SpringBootTest
class QuizEvaluationApplicationTests {

	@Autowired
	static QuizRepository dao;
	Quiz bean = new Quiz(1, "India's National animal", "GK", "Tiger", "Lion", "Elephant", "Tiger");

	@Test
	void contextLoads() {
	}

	@Test
	public void testPerformInsert() {
		dao = new QuizRepository();
		boolean value = dao.addQuiz(bean);
		assertEquals(value, true);

	}

}
