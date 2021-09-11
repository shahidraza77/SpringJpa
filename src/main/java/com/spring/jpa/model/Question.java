package com.spring.jpa.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name="ques_id")
	private int id;
	private String question;
	//@JsonIgnore
	@OneToMany(cascade= CascadeType.ALL,mappedBy="question")
	private List<Answer> answer;
	

}
