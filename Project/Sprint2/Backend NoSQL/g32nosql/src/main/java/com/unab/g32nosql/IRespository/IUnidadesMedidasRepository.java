package com.unab.g32nosql.IRespository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.g32nosql.Collection.UnidadesMedidas;

public interface IUnidadesMedidasRepository extends MongoRepository<UnidadesMedidas, String> {

}
