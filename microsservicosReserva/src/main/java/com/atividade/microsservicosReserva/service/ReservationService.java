package com.atividade.microsservicosReserva.service;


import com.atividade.microsservicosReserva.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;
}
