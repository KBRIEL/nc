package com.del_origen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.del_origen.entity.Producto;
import com.del_origen.repository.ProductoRepository;


@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Transactional(readOnly = true)
	public List<Producto> getAll() {
		return productoRepository.findAll();
		
	}

}
