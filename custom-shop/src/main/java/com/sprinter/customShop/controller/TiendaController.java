package com.sprinter.customShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.TiendaDTO;
import com.sprinter.customShop.entity.Tienda;

@RestController
@RequestMapping("/tienda")
public class TiendaController extends AbstractController<TiendaDTO, Tienda, Long> {

	protected TiendaController() {
		super(Tienda.class, TiendaDTO.class);
	}

}
