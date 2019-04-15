package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.Month;

public class TestLauncher {

	public static void main(String[] args) {
		EvaluationService ev = new EvaluationService();
		int[] set = { 43, 47 };
		System.out.println(ev.solveWordProblem("What is -1 plus -10?"));
	}

}
