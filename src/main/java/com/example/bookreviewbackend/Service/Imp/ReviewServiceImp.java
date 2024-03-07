package com.example.bookreviewbackend.Service.Imp;

import com.example.bookreviewbackend.DTO.ReviewReturnDTO;
import com.example.bookreviewbackend.Enitity.Review;
import com.example.bookreviewbackend.Repository.ReviewRepo;
import com.example.bookreviewbackend.Service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImp implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;

    ReviewServiceImp(ReviewRepo reviewRepo, ModelMapper modelMapper){
        this.reviewRepo = reviewRepo;
        this.modelMapper = modelMapper;

    }


    @Override
    public ReviewReturnDTO getReviewById(long Id) {
        return modelMapper.map(reviewRepo.findById(Id), ReviewReturnDTO.class);
    }

    @Override
    public List<ReviewReturnDTO> getAllReviews() {
        return null;
    }

    @Override
    public ReviewReturnDTO addReview(Review review) {
        return modelMapper.map(reviewRepo.save(review), ReviewReturnDTO.class);
    }

    @Override
    public void updateReview(Review review) {
         modelMapper.map(reviewRepo.save(review), ReviewReturnDTO.class);
    }

    @Override
    public void deleteAll() {
        reviewRepo.deleteAll();

    }

    @Override
    public void deleteById(long Id) {
        reviewRepo.deleteById(Id);
    }
}
