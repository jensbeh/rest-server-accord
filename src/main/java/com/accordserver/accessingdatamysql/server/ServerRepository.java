package com.accordserver.accessingdatamysql.server;

import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
 * CRUD refers Create, Read, Update, Delete
 * Spring automatically implements this repository interface in a bean that has the same name (with a change in the case - it is called userRepository).
 */
public interface ServerRepository extends CrudRepository<Server, String> {
//    Server findByName(String name);
//
//    Server findByUserKey(String userKey);
//
//    Iterable<Server> findByOnline(boolean isOnline);
}

