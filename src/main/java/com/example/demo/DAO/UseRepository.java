package com.example.demo.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.example.demo.entities.User;


public interface UseRepository extends JpaRepository<User,Integer> {
	Optional<User> findByEmail(String email); // Đăng nhập bằng Email
    Optional<User> findByUserName(String userName); // Đăng nhập bằng Username
    boolean existsByEmail(String email); // Kiểm tra Email đã tồn tại chưa khi đăng ký
}
