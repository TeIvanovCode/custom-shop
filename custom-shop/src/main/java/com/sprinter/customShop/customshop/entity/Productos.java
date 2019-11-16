package com.sprinter.customShop.customshop.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Teodor Ivanov
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTOS")
public class Productos implements EntityPadre {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idProducto;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@Column
	private String area;
	
	@Column
	private String seccion;
	
	@Column
	private String subSeccion;
	
	@Column
	private BigDecimal pvp;
}
