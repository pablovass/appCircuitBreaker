package com.vallejos.service;

import com.vallejos.domain.HotelReservation;
import com.vallejos.repository.HotelReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HotelReservationService {

    @Autowired
    private HotelReservationRepository reservationRepository;

    @Autowired
    private PaymentService paymentService;

    @Transactional
    public void makeHotelReservation(String guestName, int numOfGuests) {
        // Paso 1: Crear la reserva de hotel
        HotelReservation reservation = new HotelReservation();
        reservation.setGuestName(guestName);
        reservation.setNumOfGuests(numOfGuests);
        reservationRepository.save(reservation);

        // Paso 2: Realizar el pago
        paymentService.processPayment(guestName, numOfGuests);

        // Paso 3: Confirmar la reserva
        // (Este paso se realiza automáticamente cuando la transacción se completa con éxito)
    }
}

