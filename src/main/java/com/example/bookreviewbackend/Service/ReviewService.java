package com.example.bookreviewbackend.Service;

import com.example.bookreviewbackend.DTO.ReviewReturnDTO;
import com.example.bookreviewbackend.Enitity.Review;

import java.util.List;

public interface ReviewService {

    ReviewReturnDTO getReviewById(long Id);
    List<ReviewReturnDTO> getAllReviews();
    ReviewReturnDTO addReview(Review review);
    void updateReview(Review review);
    void deleteAll();
    void deleteById(long Id);

}
