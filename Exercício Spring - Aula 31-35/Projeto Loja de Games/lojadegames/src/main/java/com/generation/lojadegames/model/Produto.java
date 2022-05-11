package com.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")
public class Produto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long cod;
		
		@NotBlank
		public String nome;
		
		@NotBlank
		public String plataforma;
		
		@NotNull
		@PositiveOrZero
		public int qtd;
		
		@NotNull
		@Positive
		public double preco;
		
		@NotNull
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Usuario usuario;
		
		public Long getCod() {
			return cod;
		}

		public void setCod(Long cod) {
			this.cod = cod;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getPlataforma() {
			return plataforma;
		}

		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}

		public int getQtd() {
			return qtd;
		}

		public void setQtd(int qtd) {
			this.qtd = qtd;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
}