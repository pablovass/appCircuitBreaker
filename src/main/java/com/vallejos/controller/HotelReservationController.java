package com.vallejos.controller;

import com.vallejos.domain.dto.HotelReservationRequest;
import com.vallejos.service.HotelReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelReservationController {

    @Autowired
    private HotelReservationService reservationService;

    @PostMapping("/reserveHotel")
    public String reserveHotel(@RequestBody HotelReservationRequest request) {
        reservationService.makeHotelReservation(request.getGuestName(), request.getNumOfGuests());
        return "Hotel reservation successfully made.";
    }
}

