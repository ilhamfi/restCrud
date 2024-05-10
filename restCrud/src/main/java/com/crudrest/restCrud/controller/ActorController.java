package com.crudrest.restCrud.controller;

import com.crudrest.restCrud.entity.Actor;
import com.crudrest.restCrud.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActorController {
@Autowired
    private ActorService actorService;

@PostMapping("/save")
    public ResponseEntity<Actor> addActor(@RequestBody Actor actor){
    Actor addActor=actorService.addActor(actor);
    return new ResponseEntity<Actor>(addActor, HttpStatus.CREATED);
}

@GetMapping("/all")
    public ResponseEntity<List<Actor>>getAllActor(){

    List<Actor> allActor=actorService.findAllActor();

    return new ResponseEntity<List<Actor>>(allActor,HttpStatus.OK);
}
@GetMapping ("{id}")
public ResponseEntity<Actor>getActorId(@PathVariable("id")int id){
    Actor actorById=actorService.getActorById(id);
    return new ResponseEntity<>(actorById,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteActorById(@PathVariable ("id")int id){
actorService.deleteById(id);
return new ResponseEntity<Void>(HttpStatus.ACCEPTED);



    }


}
