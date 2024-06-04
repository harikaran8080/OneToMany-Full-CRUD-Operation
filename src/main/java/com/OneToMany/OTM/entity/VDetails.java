package com.OneToMany.OTM.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Details")
public class VDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vd_no;
	
	private String model;
	
	private int millege;
	
	private int speed;
	
	
	


}
