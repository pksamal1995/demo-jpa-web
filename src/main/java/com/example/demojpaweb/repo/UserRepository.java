package com.example.demojpaweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demojpaweb.demo.Acount;

@Repository
public interface UserRepository extends JpaRepository<Acount, Integer>{

}
