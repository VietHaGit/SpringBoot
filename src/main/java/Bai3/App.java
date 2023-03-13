package Bai3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class,args);
//  Lấy ra bean của GirlService
        GirlService girlService = context.getBean(GirlService.class);
// Lấy ra ramdom một cô gái từ tầng service
        Girl girl = girlService.getRandomGirt();
        System.out.print(girl);
    }
}
