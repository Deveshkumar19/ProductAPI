package com.devesh.code.OddEven;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.util.SystemPropertyUtils;

public class SqaureEvnOD {

    public static void main(String[] args) {


        int resultEven=0;
        int resultOdd=0;
        int odd=1;
        int even=2;
        Long start= System.currentTimeMillis();

        for (int i=1;i<50;i+=1) {
            resultEven+=even*even;
            even+=2;
        }
        for (int i=1;i<50;i+=1) {
            resultOdd += odd * odd;
            even += 2;
        }
        System.out.println("result="+(resultEven-resultOdd));
        System.out.println("time="+(System.currentTimeMillis()-start));

    }
}































