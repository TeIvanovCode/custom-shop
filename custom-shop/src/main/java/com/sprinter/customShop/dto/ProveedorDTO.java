package com.sprinter.customShop.dto;

import java.util.ArrayList;
import java.util.List;

import com.sprinter.customShop.entity.Productos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorDTO implements DTOEntity {

	private Long id;

	private String nombre;

	private String cif;

	private String direccion;

	private String pais;

	private List<ProductosDTO> productos = new ArrayList<>();

}
