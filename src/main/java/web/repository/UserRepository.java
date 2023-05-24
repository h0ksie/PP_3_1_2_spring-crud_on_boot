package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteById(Long id);
}
