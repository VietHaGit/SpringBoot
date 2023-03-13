package com.example.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
//		ApplicationContext chứa toàn bộ dependency của project
	ApplicationContext context = SpringApplication.run(App.class,args);

//	lấy Bean ra bằng cách
		Outfit outfit = context.getBean(Outfit.class);
//		In ra xem thứ đó là gì
		System.out.print("Instance" + outfit);
//		Dùng hàm wear()
		outfit.wear();

		Girl girl = context.getBean(Girl.class);
		System.out.print("Girl Instance: " + girl);
		System.out.print("Girl Outfit:" + girl.outfit);
		girl.outfit.wear();

//		Boy boy = context.getBean(Boy.class);
//		System.out.println(" Boy Outfit:" + boy.outfit);
//		boy.outfit.wear();
	}
}
