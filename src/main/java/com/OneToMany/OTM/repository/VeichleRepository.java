package com.OneToMany.OTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OneToMany.OTM.entity.Veichle;

@Repository
public interface VeichleRepository extends JpaRepository<Veichle, Integer>{

}
