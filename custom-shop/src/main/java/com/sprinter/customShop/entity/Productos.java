package com.sprinter.customShop.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proveedor")
	private Proveedor proveedor;
}
