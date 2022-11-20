package com.unab.g32nosql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g32nosql.Collection.Productos;
import com.unab.g32nosql.IRespository.IProductosRepository;
import com.unab.g32nosql.IService.IProductosService;

@Service
public class ProductosService implements IProductosService {
	
	@Autowired
	private IProductosRepository repository;

	@Override
	public List<Productos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Productos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Productos save(Productos productos) {
		return repository.save(productos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
