package com.example.demo.reservation;

import java.util.Collection;

public interface ReservationService {

    Reservation create(Reservation reservation);

    Collection<Reservation> getAll();

    Reservation get(Long id);

    Reservation update(Reservation reservation);

    void delete(Long id);

}