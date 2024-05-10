package com.crudrest.restCrud.repository;

import com.crudrest.restCrud.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
