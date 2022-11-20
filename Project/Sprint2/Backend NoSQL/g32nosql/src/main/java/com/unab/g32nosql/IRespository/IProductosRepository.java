package com.unab.g32nosql.IRespository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g32nosql.Collection.Productos;

public interface IProductosRepository extends MongoRepository<Productos, String> {

}
