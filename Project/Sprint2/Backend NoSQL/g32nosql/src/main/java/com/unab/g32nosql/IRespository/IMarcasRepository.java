package com.unab.g32nosql.IRespository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g32nosql.Collection.Marcas;

public interface IMarcasRepository extends MongoRepository<Marcas, String>{

}
