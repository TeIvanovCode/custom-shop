package com.sprinter.customShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.ProductosDTO;
import com.sprinter.customShop.entity.Productos;

@RestController
@RequestMapping("/productos")
public class ProductosController extends AbstractController<ProductosDTO, Productos, Long> {
	
	protected ProductosController() {
		super(Productos.class, ProductosDTO.class);
	}

}
