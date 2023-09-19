package com.rp.sec01;

import com.rp.courseutil.Util;
import com.rp.sec01.assignment.FileService;

public class Lec09AssignmentDemo {

    public static void main(String[] args) {
        FileService.read("file03")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

//        FileService.write("file03", "this is file03")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

//        FileService.delete("file03")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
