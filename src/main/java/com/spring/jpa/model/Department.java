package com.spring.jpa.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString(exclude="student")
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	private int id;
	private String name;
	@JsonIgnore
	@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="std_id",nullable=false,referencedColumnName="id")//referencedColumnName="id"
	//@JoinColumn(name="id")
	private Student student;

}
