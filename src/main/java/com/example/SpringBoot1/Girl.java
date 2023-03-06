package com.example.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    @Autowired
//           Điều này nói với Spring Boot rằng hãy tự tiêm một một instance của Outfix  và thuộc tính này khi khởi tạo girl
    Outfit outfit;
    public Girl(Outfit outfit){
        this.outfit= outfit;
    }

}
