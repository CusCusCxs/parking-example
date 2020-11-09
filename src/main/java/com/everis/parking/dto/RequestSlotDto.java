package com.everis.parking.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestSlotDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer registrationId;
	private LocalDate requestDate;

}
