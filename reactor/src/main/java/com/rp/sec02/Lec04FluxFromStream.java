package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {
    public static void main(String[] args) {
//        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Integer> integers = Arrays.asList(1998, 9876, 1234);
        Stream<Integer> stream = integers.stream();

//        stream.forEach(System.out::println);

//        Flux<Integer> integerFlux = Flux.fromStream(stream);
        Flux<Integer> integerFlux = Flux.fromStream(() -> integers.stream());

        integerFlux .subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());

        integerFlux .subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }

}
