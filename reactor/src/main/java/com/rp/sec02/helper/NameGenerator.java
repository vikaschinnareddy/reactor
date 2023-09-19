package com.rp.sec02.helper;

import com.github.javafaker.Faker;
import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class NameGenerator {

//    public static List<String> getNames(int count){
//        ArrayList<String> list = new ArrayList<>(count);
//        for(int i=0; i<count;i++){
//            list.add(getName());
//        }
//        return list;
//    }

    public static Flux<String> getNames(int count){
        return Flux.range(0,count)
                .map(i -> getName());
    }

    private static String getName(){
        Util.sleepSeconds(1);
        return Util.faker().name().fullName();
    }
}
