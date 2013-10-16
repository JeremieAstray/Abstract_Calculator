package com.jeremie.calculator.operation.factory;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.OperationSub;

public class SubFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
