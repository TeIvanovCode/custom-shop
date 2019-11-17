package com.sprinter.customShop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sprinter.customShop.entity.enums.TipoTienda;

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
public class Tienda implements EntityPadre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nombre;

	@Column
	private String direccion;

	@Column
	private String provincia;

	@Enumerated(EnumType.STRING)
	private TipoTienda tipoTienda;

	@Temporal(TemporalType.DATE)
	private Date fechaApertura;

}
