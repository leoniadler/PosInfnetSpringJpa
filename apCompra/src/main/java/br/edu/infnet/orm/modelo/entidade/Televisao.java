package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("C")
@PrimaryKeyJoinColumn(name = "produto_id")
public class Televisao extends Produto {
	
	private String marca; 
	private Double tamanho;
	private float valor;
	private boolean definicao;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isDefinicao() {
		return definicao;
	}
	public void setDefinicao(boolean definicao) {
		this.definicao = definicao;
	}
	
	

}
