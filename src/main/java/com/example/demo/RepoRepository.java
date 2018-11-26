package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface RepoRepository extends CrudRepository<Repo,Long>{

//    Repos findByOwner(String owner);
        Repo findByName(String name);


}
