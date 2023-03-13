package com.example.SpringBoot1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Naked")
@Primary // là anotation đánh dấu trên một bean , giúp nó luôn được ưu tiên lựa chọn trong th có nhiều bean cùng loại trong context.
public class Naked implements Outfit {
        @Override
    public void wear(){
            System.out.print("Đang không mặc gì");
        }
}
