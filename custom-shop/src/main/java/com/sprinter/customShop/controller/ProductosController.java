package com.sprinter.customShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.ProductosDTO;
import com.sprinter.customShop.entity.Productos;
import com.sprinter.customShop.service.implementation.ProductosServiceImpl;

@RestController
@RequestMapping("/productos")
public class ProductosController extends AbstractController<ProductosDTO, Productos, Long> {
	
	
	@Autowired
	private ProductosServiceImpl productosService;
	
	protected ProductosController() {
		super(Productos.class, ProductosDTO.class);
	}

	
	
}
