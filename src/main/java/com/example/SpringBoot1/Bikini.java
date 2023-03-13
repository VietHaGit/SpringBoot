package com.example.SpringBoot1;

import org.springframework.stereotype.Component;

@Component("Bikini")
public class Bikini implements Outfit {
    @Override
    public void wear(){
        System.out.print("Mac Bikini");
    }
}
