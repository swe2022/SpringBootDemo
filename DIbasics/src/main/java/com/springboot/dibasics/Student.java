package com.springboot.dibasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")  // same as @Scope("prototype")
 public class Student {

    private int id;
    private String name;
    @Autowired   // not recommended to @Autowired fields
    private Phone phone;

    public Student() {
        System.out.println("Student Created");
    }

//    @Autowired
//    public Student(Phone phone) {
//        this.phone = phone;
//        System.out.println("Student Created.");
//    }
    public void say() {
        System.out.println("I am a student.");
        phone.ringing();
    }

}
