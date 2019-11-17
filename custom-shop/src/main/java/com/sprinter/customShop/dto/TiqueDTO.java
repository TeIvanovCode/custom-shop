package com.sprinter.customShop.dto;

import java.util.Date;

import com.sprinter.customShop.entity.enums.ModoPago;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TiqueDTO implements DTOEntity {

	private Long id;

	private Date fecha;

	private ModoPago modoPago;

}
