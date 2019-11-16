package com.sprinter.customShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sprinter.customShop.dao.ProveedorDao;
import com.sprinter.customShop.entity.Proveedor;
import com.sprinter.customShop.service.AbstractService;
import com.sprinter.customShop.service.ProveedorService;

@Service
public class ProveedorServiceImpl extends AbstractService<Proveedor, Long> implements ProveedorService {

	@Autowired
	private ProveedorDao proveedorDao;

	@Override
	protected CrudRepository<Proveedor, Long> getDAO() {
		return this.proveedorDao;
	}

}
