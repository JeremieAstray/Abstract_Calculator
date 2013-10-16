package com.jeremie.calculator.operation.factory;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.OperationMul;

public class MulFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
