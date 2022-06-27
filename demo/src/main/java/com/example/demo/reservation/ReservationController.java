package com.example.demo.reservation;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/reservation")
@AllArgsConstructor
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

}
