package com.example.bookreviewbackend.Service.Imp;

import com.example.bookreviewbackend.DTO.ReviewReturnDTO;
import com.example.bookreviewbackend.Enitity.Review;
import com.example.bookreviewbackend.Repository.ReviewRepo;
import com.example.bookreviewbackend.Service.ReviewService;
import com.example.bookreviewbackend.Util.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImp implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    private final ListMapper<Review, ReviewReturnDTO> listMapper;

    ReviewServiceImp(ReviewRepo reviewRepo, ModelMapper modelMapper, ListMapper<Review, ReviewReturnDTO> listMapper){
        this.reviewRepo = reviewRepo;
        this.modelMapper = modelMapper;
        this.listMapper = listMapper;
    }


    @Override
    public ReviewReturnDTO getReviewById(long Id) {
        return modelMapper.map(reviewRepo.findById(Id), ReviewReturnDTO.class);
    }

    @Override
    public List<ReviewReturnDTO> getAllReviews() {
        return reviewRepo.findAll().stream().
                map(e-> modelMapper.map(e, ReviewReturnDTO.class))
                .collect(Collectors.toList());
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
