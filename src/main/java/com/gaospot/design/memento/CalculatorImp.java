package com.gaospot.design.memento;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 09:57
 */

public class CalculatorImp implements Calculator {

    private int firstNumber;

    private int sencondNumber;

    @Override
    public int getResult() {
        return this.firstNumber + this.sencondNumber;
    }

    @Override
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public void setSecondNumber(int secondNumber) {
        this.sencondNumber = secondNumber;
    }

    @Override
    public PreviousCalculationToCareTaker backup() {
        return new PreviousCalculationImp(firstNumber, sencondNumber);
    }

    @Override
    public void restore(PreviousCalculationToCareTaker memento) {
        this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
        this.sencondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
    }
}
