package com.example.birthdaynotifier.repository;

import com.example.birthdaynotifier.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByBirthday(LocalDate birthday);
}