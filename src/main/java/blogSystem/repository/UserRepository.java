package blogSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import blogSystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}