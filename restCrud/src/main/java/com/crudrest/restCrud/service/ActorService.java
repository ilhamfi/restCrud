package com.crudrest.restCrud.service;

import com.crudrest.restCrud.entity.Actor;
import com.crudrest.restCrud.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

public Actor addActor(Actor actor){

    return actorRepository.save(actor);
}

public List<Actor> findAllActor(){

     return actorRepository.findAll();

}
public Actor getActorById(int actorId){

    return actorRepository.findById(actorId).get();
}

public void deleteById(int actorId){
    actorRepository.deleteById(actorId);

}



}
