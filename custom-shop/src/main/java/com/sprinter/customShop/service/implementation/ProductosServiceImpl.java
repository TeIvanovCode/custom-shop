package com.sprinter.customShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sprinter.customShop.dao.ProductosDao;
import com.sprinter.customShop.entity.Productos;
import com.sprinter.customShop.service.AbstractService;
import com.sprinter.customShop.service.ProductosService;

@Service
public class ProductosServiceImpl extends AbstractService<Productos, Long> implements ProductosService {

	@Autowired
	private ProductosDao productosDao;

	@Override
	protected CrudRepository<Productos, Long> getDAO() {
		return this.productosDao;
	}

}
