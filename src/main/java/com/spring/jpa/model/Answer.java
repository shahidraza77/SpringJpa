package com.spring.jpa.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name="ans_id")
	private int id;
	private String answer;
	@JsonIgnore
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="ques_id" )
	private Question question;

}
