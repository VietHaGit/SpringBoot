package com.example.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
   Outfit outfit;
    public void setOutfit( Outfit outfit) {
        this.outfit = outfit;
    }
}
