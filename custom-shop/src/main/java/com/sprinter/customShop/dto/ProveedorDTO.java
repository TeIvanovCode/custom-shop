package com.sprinter.customShop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorDTO implements DTOEntity {

	private Long idProveedor;

	private String nombre;

	private String cif;

	private String direccion;

	private String pais;

}
