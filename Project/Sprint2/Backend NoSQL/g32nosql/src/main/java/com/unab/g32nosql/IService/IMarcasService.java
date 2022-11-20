package com.unab.g32nosql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g32nosql.Collection.Marcas;

public interface IMarcasService {

	public List<Marcas> all();

	public Optional<Marcas> findById(String id);

	public Marcas save(Marcas marcas);

	public void delete(String id);
}
