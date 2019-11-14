package com.sprinter.customShop.entity;

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
@Table(name = "TIQUE")
public class Tique {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long idTique;

	@Column
	private LocalDate fecha;
	
	// TODO: Posible cambio a enumeracion
	@Column
	private String modoPago;
	
}