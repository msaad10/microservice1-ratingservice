package com.learning.rating.service.services.impl;

import com.learning.rating.service.entities.Rating;
import com.learning.rating.service.repositories.RatingRepository;
import com.learning.rating.service.services.RatingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating create(Rating rating) {
        final var userId = UUID.randomUUID().toString();
        rating.setId(userId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
