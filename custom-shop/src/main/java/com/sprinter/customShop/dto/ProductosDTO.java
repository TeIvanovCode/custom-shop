package com.sprinter.customShop.dto;

import java.math.BigDecimal;

import com.sprinter.customShop.entity.Proveedor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductosDTO implements DTOEntity {

	private Long id;

	private String nombre;

	private String descripcion;

	private String area;

	private String seccion;

	private String subSeccion;

	private BigDecimal pvp;	

}
