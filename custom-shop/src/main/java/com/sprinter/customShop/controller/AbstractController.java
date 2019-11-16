package com.sprinter.customShop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprinter.customShop.dto.DTOEntity;
import com.sprinter.customShop.entity.EntityPadre;
import com.sprinter.customShop.service.AbstractService;

public abstract class AbstractController<DTO extends DTOEntity, E extends EntityPadre, ID> {

	@Autowired
	protected DozerBeanMapper mapper;

	@Autowired
	private AbstractService<E, ID> manager;

	private Class<E> entityClass;
	private Class<DTO> dtoClass;

	protected AbstractController(Class<E> entityClass, Class<DTO> dtoClass) {
		this.entityClass = entityClass;
		this.dtoClass = dtoClass;
	}

	@GetMapping
	public List<DTO> getAll() {
		List<E> entityList = (List<E>) manager.findAll();

		return entityList.stream().map(e -> mapper.map(e, dtoClass)).collect(Collectors.toList());
	}

	@GetMapping("/{id}")
	public DTO getById(@PathVariable("id") ID id) {
		final E entity = manager.findById(id);
		DTO entityDTO = null;
		if (null != entity) {
			entityDTO = mapper.map(entity, dtoClass);
		}
		return entityDTO;
	}

	@PostMapping
	public DTO create(@RequestBody DTO entity) {
		E entityDB = manager.save(mapper.map(entity, entityClass));
		DTO entityDTO = null;
		if (null != entityDB) {
			entityDTO = mapper.map(entityDB, dtoClass);
		}
		return entityDTO;
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") ID id) {
		final E entity = manager.findById(id);
		if (null != entity) {
			manager.remove(entity);
		}
	}
}
