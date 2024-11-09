package com.learning.rating.service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Rating {
    @Id
    private String id;
    @NotNull
    private String userId;
    @NotNull
    private String hotelId;
    @NotNull
    private int rating;
    @NotNull
    private String feedback;
}
