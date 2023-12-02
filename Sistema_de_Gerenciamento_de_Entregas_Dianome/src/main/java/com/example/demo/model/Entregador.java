package com.example.demo.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entregador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    private String cpf;
    @Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entregador other = (Entregador) obj;
		return Objects.equals(id, other.id);
	}
	@Column()
    private String nome;
	@Column()
    private int capacidadeVeiculo;
	@Column()
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidadeVeiculo() {
		return capacidadeVeiculo;
	}
	public void setCapacidadeVeiculo(int capacidadeVeiculo) {
		this.capacidadeVeiculo = capacidadeVeiculo;
	}

}
