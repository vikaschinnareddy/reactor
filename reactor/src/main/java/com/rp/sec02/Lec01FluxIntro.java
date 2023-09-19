package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxIntro {

    public static void main(String[] args) {
        Flux<String> flux = Flux.just("vikas", "chinna", "reddy");
        flux.subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }
}
