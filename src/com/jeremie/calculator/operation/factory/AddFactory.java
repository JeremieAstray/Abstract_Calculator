package com.jeremie.calculator.operation.factory;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.OperationAdd;

public class AddFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
