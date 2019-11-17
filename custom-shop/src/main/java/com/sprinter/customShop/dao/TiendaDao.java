package com.sprinter.customShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprinter.customShop.entity.Tienda;

/**
 * @author Teodor Ivanov
 *
 */
@Repository
public interface TiendaDao extends CrudRepository<Tienda, Long> {

}
