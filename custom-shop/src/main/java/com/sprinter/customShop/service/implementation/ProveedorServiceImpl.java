package com.sprinter.customShop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sprinter.customShop.dao.ProveedorDao;
import com.sprinter.customShop.entity.Productos;
import com.sprinter.customShop.entity.Proveedor;
import com.sprinter.customShop.service.AbstractService;
import com.sprinter.customShop.service.ProveedorService;

import lombok.extern.log4j.Log4j2;

/**
 * @author Teodor Ivanov
 *
 */
@Log4j2
@Service
public class ProveedorServiceImpl extends AbstractService<Proveedor, Long> implements ProveedorService {

	@Autowired
	private ProveedorDao proveedorDao;

	@Override
	protected CrudRepository<Proveedor, Long> getDAO() {
		return this.proveedorDao;
	}

	/**
	 *
	 */
	@Override
	public Proveedor addProducto(Long id, Iterable<Productos> productos) {
		Proveedor proveedor = null;
		try {

			proveedor = proveedorDao.findById(id).orElse(null);
			if (null != proveedor && null != productos) {
				for (final Productos producto : productos) {
					if (null != producto) {
						proveedor.getProductos().add(producto);
					}
				}
				proveedor = proveedorDao.save(proveedor);
			} else {
				proveedor = null;
			}
		} catch (UnsupportedOperationException e) {
			log.catching(e);
		} catch (ClassCastException e) {
			log.catching(e);
		} catch (NullPointerException e) {
			log.catching(e);
		} catch (IllegalArgumentException e) {
			log.catching(e);
		}

		return proveedor;
	}

}
