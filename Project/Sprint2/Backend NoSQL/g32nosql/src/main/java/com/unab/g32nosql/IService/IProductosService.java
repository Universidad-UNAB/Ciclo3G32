package com.unab.g32nosql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g32nosql.Collection.Productos;

public interface IProductosService {

	public List<Productos> all();

	public Optional<Productos> findById(String id);

	public Productos save(Productos productos);

	public void delete(String id);
}
