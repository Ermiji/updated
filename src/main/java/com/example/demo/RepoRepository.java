package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface RepoRepository extends CrudRepository<Repo,Long>{

//    Repo findByOwner(String owner);
        Repo findByName(String name);
        Repo findById(long id);


}
