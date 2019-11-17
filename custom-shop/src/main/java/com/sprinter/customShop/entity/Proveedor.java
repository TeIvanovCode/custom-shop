package com.sprinter.customShop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Proveedor implements EntityPadre{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nombre;
	
	@Column
	private String cif;
	
	@Column
	private String direccion;
	
	@Column
	private String pais;
	
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.EAGER)
	private List<Productos> productos = new ArrayList<>();
}
