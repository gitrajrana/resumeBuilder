package in.resumebuilder.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.resumebuilder.resume.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
