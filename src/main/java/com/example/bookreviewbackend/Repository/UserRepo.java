package com.example.bookreviewbackend.Repository;

import com.example.bookreviewbackend.Enitity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
}
