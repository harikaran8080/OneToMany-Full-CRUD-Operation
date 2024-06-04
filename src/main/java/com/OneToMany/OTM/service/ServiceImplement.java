package com.OneToMany.OTM.service;

import java.util.List;
import java.util.Optional;

import com.OneToMany.OTM.entity.Veichle;

public interface ServiceImplement {

	Veichle post(Veichle veichle);

	List<Veichle> postall(List<Veichle> veichle);

	Optional<Veichle> get(int id);

	List<Veichle> getall();

	Veichle update(Veichle veichle);

	String delete(int id);

	

}
