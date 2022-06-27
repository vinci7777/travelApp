package com.example.demo.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;
    private String flightFrom;
    private String flightTo;
    private LocalDateTime flightStart;
    private LocalDateTime flightEnd;
    private String flightQuality;
    private double flightPrice;
}
