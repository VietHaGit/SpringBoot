package Bai3;
//Tạo ra một interface GirlRepository để giao tiếp với DB.
public interface GirlRepository {
    /**
     * Tìm kiếm một cô gái trong database theo tên
     * @param name
     * @return
     */
    Girl getGirlByName(String Name);
}
