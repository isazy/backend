package com.controledeLigacoes.entities;

import jakarta.persistence.Column;

public class Agenda {
		private Long id; 
		  
		@Column(name = "nome") 
		private String nome; 

		@Column(name = "ddd") 
		private String ddd; 

		@Column(name = "telefone") 
		private String telefone; 

		public Long getId() { 
			return id; 
		} 
		public void setId(Long id) { 
			this.id = id; 
		} 
		public String getNome() { 
			return nome; 
		} 
		public void setNome(String nome) { 
			this.nome = nome; 
		} 
		public String getDdd() { 
			return ddd; 
		} 
		public void setDdd(String ddd) { 
			this.ddd = ddd; 
		} 
		public String getTelefone() { 
			return telefone; 
		} 
		public void setSalario(String telefone) { 
			this.telefone = telefone; 
		} 
	}


