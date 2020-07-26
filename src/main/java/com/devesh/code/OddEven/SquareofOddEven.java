/*
package com.devesh.code.OddEven;

import java.math.BigInteger;

public class SquareofOddEven {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {10000, 20000, 30000, 60000, 7700, 4000, 5000, 7000, 15000, 40000, 50000};

        long start = System.currentTimeMillis();

        MyThread[] threadEven = new MyThread[50];
        for (int i = 0; i < 50; i++) {

            //threadEven[i] = new MyThread();
            threadEven[i].start();
        }

        MyThread[] threadOdd = new MyThread[50];
        for (int i = 0; i < 50; i++) {

            //threadEven[i] = new MyThread();
            threadOdd[i].start();
        }

        // t1, t2, ... t10
        for (int i = 0; i < threads.length; i++) {

            // blocking call
            threads[i].join(100);
            System.out.println("factorial of number "+ arr[i]+"="+threads[i].result);
        }

        System.out.println(System.currentTimeMillis() - start);

    }


    private static class MyThread extends Thread {

        int num;
        BigInteger result;



        public void run() {

            long start = System.currentTimeMillis();
            calculate();
        }

        public void calculate() {

            for (int i = 2; i <= this.num; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }

        }

    }
}
*/
