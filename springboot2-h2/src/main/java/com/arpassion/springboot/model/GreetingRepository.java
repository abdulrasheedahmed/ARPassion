package com.arpassion.springboot.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {

}
