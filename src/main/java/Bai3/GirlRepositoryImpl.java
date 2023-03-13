package Bai3;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository {
    @Override
    public Girl getGirlByName(String Name){
        // Ở đây  ví dụ là database đã trả về
        // một cô gái với tên đúng như tham số

        // Còn thực tế phải query trong csđl nhé.
        return new Girl(Name);
    }
}
