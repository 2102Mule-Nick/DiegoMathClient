package com.revature.ws;

public class Driver {

	public static void main(String[] args) {

		MathCalcService mathCalcService =  new MathCalcService();
		MathCalc mathTest = mathCalcService.getMathCalcImplPort();
		
		System.out.println("Add 5 + 5 = " + mathTest.doAddition(5, 5));
		System.out.println("Substract 5 - 5 = " + mathTest.doSubtraction(5, 5));
		System.out.println("Multiply 5 * 5 = " + mathTest.doMultiplication(5, 5));
		System.out.println("Divide 5 / 5 = " + mathTest.doDivision(5, 5));
		System.out.println("Mudle 5 % 5 = " + mathTest.doModulo(5, 5));
		
	}

}
