package com.sprinter.customShop.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductosDTO implements DTOEntity {

	private Long idProducto;

	private String nombre;

	private String descripcion;

	private String area;

	private String seccion;

	private String subSeccion;

	private BigDecimal pvp;

}
