package com.sprinter.customShop.dto;

import java.util.Date;

import com.sprinter.customShop.entity.enums.TipoTienda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TiendaDTO implements DTOEntity {

	private Long id;

	private String nombre;

	private String direccion;

	private String provincia;

	private TipoTienda tipoTienda;

	private Date fechaApertura;
}
