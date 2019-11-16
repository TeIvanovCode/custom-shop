package com.sprinter.customShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprinter.customShop.entity.Tique;

/**
 * @author Teodor Ivanov
 *
 */
@Repository
public interface TiquetDao extends CrudRepository<Tique, Long>{

}
