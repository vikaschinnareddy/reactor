package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec02MultipleSubscribers {

    public static void main(String[] args) {

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4);

        integerFlux.subscribe(i -> System.out.println("sub 1:" + i));
        System.out.println();
        integerFlux.subscribe(i -> System.out.println("sub 2:" + i));

        Flux<Integer> evenFlux = integerFlux.filter(i -> i % 2 == 0);
        evenFlux.subscribe(i -> System.out.println("sub 3:"+ i));
    }
}
