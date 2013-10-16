package com.jeremie.calculator.operation.factory;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.OperationDiv;

public class DivFactory implements OperationFactory{

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
