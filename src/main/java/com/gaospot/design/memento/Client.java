package com.gaospot.design.memento;

/**
 * @author gaoxiong@asiainfo.com
 * @date 2019-08-16 10:06
 */

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(20);

        System.out.println(calculator.getResult());

        PreviousCalculationToCareTaker memento = calculator.backup();

        calculator.setFirstNumber(-10);
        calculator.setSecondNumber(-20);

        System.out.println(calculator.getResult());

        calculator.restore(memento);
        System.out.println(calculator.getResult());


    }
}
