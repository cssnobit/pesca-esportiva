package com.pescaria.api_rest.dto;

import java.sql.Date;
import java.sql.Time;

public record ReservationRequestDTO(Integer qntPeople, Date occupationDate,
		Time occupationTime, Long customerId) { }