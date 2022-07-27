package com.springboot.dibasics;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String number;

    public void ringing() {
        System.out.println("Ring, Ring, Ringing");
    }
}
