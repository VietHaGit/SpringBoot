package Bai3;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    public Girl getRandomGirt(){
//        random 1 cái tên với độ dài 10
        String Name = randomGirlName(10);
//        gọi xuống hàm repository để lấy một cô gái tên Name trong database
        return girlRepository.getGirlByName(Name);
    }
    public String randomGirlName(int length){
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }
}
