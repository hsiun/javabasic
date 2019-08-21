package com.gaospot.design.memento;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:01
 */

public class PreviousCalculationImp implements
        PreviousCalculationToCareTaker, PreviousCalculationToOriginator {

    private int firstNumber;

    private int secondNumber;

    @Override
    public int getFirstNumber() {
        return this.firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return this.secondNumber;
    }


    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
