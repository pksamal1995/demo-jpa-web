package com.example.demojpaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpaweb.demo.Acount;
import com.example.demojpaweb.repo.UserRepository;

@RestController
@RequestMapping("/acount")
public class AcountController {
	
//	@Autowired
//	private EntityManager entityManager;
	
	@Autowired
	UserRepository repo;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Acount>> getAccounts(){
		return new ResponseEntity<List<Acount>>(repo.findAll(), HttpStatus.OK);
	}
	@GetMapping("/demo")
	public String demo() {return "demo";}
}
