package com.sprinter.customShop.entity;

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
@Table(name = "PROVEEDOR")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idProveedor;

	@Column
	private String nombre;
	
	@Column
	private String cif;
	
	@Column
	private String direccion;
	
	@Column
	private String pais;
}
