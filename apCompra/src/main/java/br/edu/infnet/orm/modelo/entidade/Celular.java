package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("C")
@PrimaryKeyJoinColumn(name = "produto_id")
public class Celular extends Produto{

	private String marca; 
	private String modelo;
	private float valor;
	private boolean carregador;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isCarregador() {
		return carregador;
	}
	public void setCarregador(boolean carregador) {
		this.carregador = carregador;
	}
	
	
	
	
}
