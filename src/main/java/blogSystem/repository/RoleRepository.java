package blogSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import blogSystem.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}