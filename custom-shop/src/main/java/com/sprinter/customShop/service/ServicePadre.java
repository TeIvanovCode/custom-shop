package com.sprinter.customShop.service;

import com.sprinter.customShop.entity.EntityPadre;

public interface ServicePadre <E extends EntityPadre, ID>{

	public Iterable<E> findAll();
	public E findById(ID id);
	public E save(E e);
	public Iterable<E> save(Iterable<E> es);
	public E update(E e);
	public Iterable<E> update(Iterable<E> es);
	public void remove(E e);
}
