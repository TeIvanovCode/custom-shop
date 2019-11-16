package com.sprinter.customShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sprinter.customShop.dao.TiquetDao;
import com.sprinter.customShop.entity.Tique;
import com.sprinter.customShop.service.AbstractService;
import com.sprinter.customShop.service.TiqueService;

@Service
public class TiqueServiceImpl extends AbstractService<Tique, Long> implements TiqueService {

	@Autowired
	private TiquetDao tiquetDao;

	@Override
	protected CrudRepository<Tique, Long> getDAO() {
		return this.tiquetDao;
	}

}
