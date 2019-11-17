package com.sprinter.customShop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.ProductosDTO;
import com.sprinter.customShop.dto.ProveedorDTO;
import com.sprinter.customShop.entity.Productos;
import com.sprinter.customShop.entity.Proveedor;
import com.sprinter.customShop.service.implementation.ProductosServiceImpl;
import com.sprinter.customShop.service.implementation.ProveedorServiceImpl;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/proveedor")
public class ProveedorController extends AbstractController<ProveedorDTO, Proveedor, Long> {

	@Autowired
	private ProveedorServiceImpl proveedorService;

	protected ProveedorController() {
		super(Proveedor.class, ProveedorDTO.class);
	}

	@PostMapping("/{id}/addproduct")
	public ProveedorDTO addProduct(@PathVariable("id") Long id, @RequestBody List<ProductosDTO> productosDTO) {
		List<Productos> productos = new ArrayList<>();
		try {

			for (ProductosDTO productoDTO : productosDTO) {
				if (null != productoDTO) {
					productos.add(mapper.map(productoDTO, Productos.class));
				}
			}
		} catch (Exception e) {
			log.catching(e);
		}
		return mapper.map(proveedorService.addProducto(id, productos), ProveedorDTO.class);
	}

}
