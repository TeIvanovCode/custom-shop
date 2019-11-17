package com.sprinter.customShop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.dozer.MappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprinter.customShop.dto.DTOEntity;
import com.sprinter.customShop.entity.EntityPadre;
import com.sprinter.customShop.service.AbstractService;

import lombok.extern.log4j.Log4j2;

@Log4j2
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
		DTO entityDTO = null;
		try {
			final E entity = manager.findById(id);
			if (null != entity) {
				entityDTO = mapper.map(entity, dtoClass);
			}
		} catch (MappingException e) {
			log.catching(e);
		}
		return entityDTO;
	}

	@PostMapping
	public DTO create(@RequestBody DTO entity) {
		DTO entityDTO = null;
		try {
			E entityDB = manager.save(mapper.map(entity, entityClass));
			if (null != entityDB) {
				entityDTO = mapper.map(entityDB, dtoClass);
			}
		} catch (MappingException e) {
			log.catching(e);
		}
		return entityDTO;
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") ID id) {
		final E entity = manager.findById(id);
		if (null != entity) {
			log.info("Borrando "+ entity.getClass().getName());
			manager.remove(entity);
		}
	}
}
