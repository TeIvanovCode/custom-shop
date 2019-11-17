package com.sprinter.customShop.service;

import com.sprinter.customShop.entity.Productos;
import com.sprinter.customShop.entity.Proveedor;

public interface ProveedorService extends ServicePadre<Proveedor, Long> {

	public Proveedor addProducto(Long id, Iterable<Productos> productos);

}
