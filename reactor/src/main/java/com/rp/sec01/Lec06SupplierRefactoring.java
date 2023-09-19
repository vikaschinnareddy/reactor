package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {
    public static void main(String[] args) {
        getName();
//        getName().subscribe(Util.onNext());
        String name = getName().subscribeOn(Schedulers.boundedElastic())
                .block();
        System.out.println(name);
        getName();
    }

    private static Mono<String> getName(){
        System.out.println("entered the getName method:");
        return Mono.fromSupplier(() ->{
                System.out.println("genearting the name");
        Util.sleepSeconds(3);
        return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
