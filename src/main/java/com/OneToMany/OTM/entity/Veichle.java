package com.OneToMany.OTM.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "veichle")
public class Veichle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int v_no;

	private String v_name;

	private String v_colour;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_v_no",referencedColumnName = "v_no")
	private List<VDetails> details;


}
