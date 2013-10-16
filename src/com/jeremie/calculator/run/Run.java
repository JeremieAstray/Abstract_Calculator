package com.jeremie.calculator.run;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.factory.DivFactory;
import com.jeremie.calculator.operation.factory.OperationFactory;
import com.jeremie.calculator.operation.factory.SqrtFactory;

public class Run {

	public static void main(String[] args) {
		OperationFactory OperFactory = new SqrtFactory();
		Operation Oper = OperFactory.createOperation();
		Oper.set_numberA(2);
		Oper.set_numberB(0);
		try{
			double result = Oper.GetResult();
			System.out.println(result);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
