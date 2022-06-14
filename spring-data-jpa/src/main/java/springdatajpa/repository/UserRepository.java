package springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
