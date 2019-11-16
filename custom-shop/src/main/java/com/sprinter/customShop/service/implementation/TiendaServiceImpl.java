package com.sprinter.customShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sprinter.customShop.dao.TiendaDao;
import com.sprinter.customShop.entity.Tienda;
import com.sprinter.customShop.service.AbstractService;
import com.sprinter.customShop.service.TiendaService;

@Service
public class TiendaServiceImpl extends AbstractService<Tienda, Long> implements TiendaService {

	@Autowired
	private TiendaDao tiendaDao;

	@Override
	protected CrudRepository<Tienda, Long> getDAO() {
		return this.tiendaDao;
	}

}
