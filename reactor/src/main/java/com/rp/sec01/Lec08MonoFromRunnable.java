package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec08MonoFromRunnable {

    public static void main(String[] args) {

//        Runnable runnable = ()-> System.out.println("runnable method");

        Mono.fromRunnable(timeConsumingProcess())
                .subscribe(Util.onNext(),
                        Util.onError(),
                        () -> {
                            System.out.println("process is done");
                        });
    }

    private static Runnable timeConsumingProcess(){
        return () ->  {
            Util.sleepSeconds(5);
            System.out.println("runnable method");
        };
    }
}
