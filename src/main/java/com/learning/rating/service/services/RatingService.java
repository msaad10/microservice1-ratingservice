package com.learning.rating.service.services;

import com.learning.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {
        Rating create(Rating rating);

        List<Rating> getAllRatings();

        List<Rating> getByUserId(String userId);

        List<Rating> getByHotelId(String hotelId);
}
