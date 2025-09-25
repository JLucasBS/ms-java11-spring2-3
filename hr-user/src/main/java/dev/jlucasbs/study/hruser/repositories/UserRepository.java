package dev.jlucasbs.study.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jlucasbs.study.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
