package com.example.demo.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.demo.entities.User;


public interface UseRepository extends JpaRepository<User,Integer> {
	Optional<User> findByEmailAndPassWord(String email, String passWord);
	 Optional<User> findByUserNameAndPassWord(String userName, String passWord);

    boolean existsByEmail(String email); // Kiểm tra Email đã tồn tại chưa khi đăng ký
    boolean existsByUserName(String userName); // Kiểm tra Email đã tồn tại chưa khi đăng ký
}
	