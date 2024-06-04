package com.OneToMany.OTM.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.OneToMany.OTM.entity.Veichle;
import com.OneToMany.OTM.repository.VeichleRepository;

@org.springframework.stereotype.Service

public class Service implements ServiceImplement {
	
	@Autowired
	private VeichleRepository repository;

	@Override
	public Veichle post(Veichle veichle) {
		return repository.save(veichle);
	}

	@Override
	public List<Veichle> postall(List<Veichle> veichle) {
		return repository.saveAll(veichle);
	}

	@Override
	public Optional<Veichle> get(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Veichle> getall() {
		return repository.findAll();
	}

	@Override
	public Veichle update(Veichle veichle) {
		Optional<Veichle>optional=repository.findById(veichle.getV_no());
		Veichle veichle2=optional.get();
		veichle2.setV_no(veichle.getV_no());
		veichle2.setV_name(veichle.getV_name());
		veichle2.setV_colour(veichle.getV_colour());
		return repository.save(veichle2);
	}

	@Override
	public String delete(int id) {
		repository.deleteById(id);
		return "Successfully Deleted";
	}

	

}
