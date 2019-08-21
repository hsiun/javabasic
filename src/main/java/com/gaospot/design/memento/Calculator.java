package com.gaospot.design.memento;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 09:52
 */

public interface Calculator {

    int getResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);

    PreviousCalculationToCareTaker backup();

    void restore(PreviousCalculationToCareTaker memento);


}
