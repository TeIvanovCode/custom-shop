package com.sprinter.customShop.customshop.entity;

import java.time.LocalDate;

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
@Table(name = "TIENDA")
public class Tienda implements EntityPadre{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idTienda;

	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String provincia;
	
	//TODO: posible cambio a enumeracion
	@Column
	private String tipo;
	
	@Column
	private LocalDate fechaApertura;
	
}

