package com.sprinter.customShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.ProveedorDTO;
import com.sprinter.customShop.entity.Proveedor;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController extends AbstractController<ProveedorDTO, Proveedor, Long> {
	
	protected ProveedorController() {
		super(Proveedor.class, ProveedorDTO.class);
	}

}
