package com.sprinter.customShop.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TiendaDTO implements DTOEntity {

	private Long idTienda;

	private String nombre;

	private String direccion;

	private String provincia;

	private String tipo;

	private LocalDate fechaApertura;
}
