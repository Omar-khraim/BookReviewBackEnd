package com.example.bookreviewbackend.Repository;

import com.example.bookreviewbackend.Enitity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {
}
