package com.avaliacaoMapeamento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="produto")

public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "categoria",nullable = false, length = 100)
	private String categoria;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "preco", nullable = false, length = 100)
	private Double preco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fornecedor", nullable = false)
	private Fornecedor fornecedor;



}

