package com.OneToMany.OTM.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany.OTM.entity.Veichle;
import com.OneToMany.OTM.service.ServiceImplement;

@RestController
@RequestMapping("/veichle/api")
public class VeichleController {
	
	
	@Autowired
	private ServiceImplement implement;
	
	@PostMapping("/post")
	public Veichle post(@RequestBody Veichle veichle) {
		return implement.post(veichle);
	}
	
	@PostMapping("/postall")
	public List<Veichle>postall(@RequestBody List<Veichle> veichle ){
		return implement.postall(veichle);
	}

	@GetMapping("/get/{id}")
	public Optional<Veichle> get (@PathVariable int id){
		return implement.get(id);
		
	}
	
	@GetMapping("/getall")
	public List<Veichle> getall() {
		return implement.getall();
	}
	
	@PutMapping("/update")
	public Veichle update(@RequestBody Veichle veichle) {
		return implement.update(veichle);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return implement.delete(id);
		
	}
	

}
