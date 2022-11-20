package com.unab.g32nosql.IRespository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g32nosql.Collection.Categorias;

public interface ICategoriasRepository extends MongoRepository<Categorias, String> {

}
