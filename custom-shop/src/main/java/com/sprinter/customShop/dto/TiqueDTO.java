package com.sprinter.customShop.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TiqueDTO implements DTOEntity {

	private Long idTique;

	private LocalDate fecha;

	private String modoPago;

}
