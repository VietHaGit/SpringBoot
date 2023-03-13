package com.example.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
//           Điều này nói với Spring Boot rằng hãy tự tiêm một một instance của Outfix  vào thuộc tính này khi khởi tạo girl
    Outfit outfit;
    public Girl( @Qualifier("Naked")Outfit outfit){
        this.outfit= outfit;
    }

}
