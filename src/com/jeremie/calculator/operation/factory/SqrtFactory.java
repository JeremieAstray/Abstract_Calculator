package com.jeremie.calculator.operation.factory;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.OperationSqrt;

public class SqrtFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		return new OperationSqrt();
	}

}
