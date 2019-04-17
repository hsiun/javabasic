package com.gaospot.practice;

/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/1/30 3:54 PM
 * @description:
 * 5辆汽车过隧道，隧道一次只能通过一辆汽车，
 * 每辆汽车通过时间不固定
 * 机动车通过时间3秒，
 * 三轮车通过时间5秒，
 * 蓄力车通过实践10秒，
 * 5辆车分别是2辆机动车，2辆蓄力车，1辆三轮车
 * 通过多线程模拟通过隧道的情况
 * 提示：Car ThreeCar CowCar
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        Car car1 = new Car("机动车1" , 3);
        Car car2 = new Car("机动车2" , 3);
        Car car3 = new Car("三轮车1" , 5);
        Car car4 = new Car("蓄力车1" , 10);
        Car car5 = new Car("蓄力车2" , 10);
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();

        try {
            //父线程调用，等待子线程结束
            car1.join();
            car2.join();
            car3.join();
            car4.join();
            car5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("所有车都已通过。");

    }

}


class Car extends Thread{
    private String name;
    private int time;
    private static Object object = new Object();

    public Car(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        pass();
        //正在执行的子线程调用，通过后让出CPU
        Thread.yield();
    }

    private void pass(){
        synchronized (object) {
            System.out.println(name + "车通过隧道");
            try {
                Thread.sleep(1000 * time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "花了" + time + "s通过隧道。");
        }
    }
}
