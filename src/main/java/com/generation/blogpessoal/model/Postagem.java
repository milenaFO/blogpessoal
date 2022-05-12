package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // create table
@Table (name = "tb_postagens") //tb_postagens
public class Postagem {
@Id //primary key id
@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
private Long id;

@NotBlank (message = "O atributo título é obrigatório!")
@Size (min = 5, max = 100, message = "O atributo título deve conter no mínimo 5 no máximo 100 caracteres!")
private String titulo;
@NotNull (message = "O atributo texto é obrigatório!")
@Size (min = 10, max = 1000, message = "O atributo título deve conter no mínimo 10 no máximo 1000 caracteres!")
private String texto;

@UpdateTimestamp
private LocalDateTime data;

@ManyToOne
@JsonIgnoreProperties("postagem")
private Tema tema;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}

public Tema getTema() {
	return tema;
}

public void setTema(Tema tema) {
	this.tema = tema;
}
}
