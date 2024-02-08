package com.vallejos.repository;

import com.vallejos.domain.HotelReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelReservationRepository extends JpaRepository<HotelReservation, Long> {
}

