package com.geekster.DoctorApp.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.io.Serializable;
import java.time.LocalDateTime;
@Embeddable
public class AppointmentKey implements Serializable {//serializable bytes

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long appointmentId;
    public LocalDateTime time;

}
