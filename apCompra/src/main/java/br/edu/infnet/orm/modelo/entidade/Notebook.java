package br.edu.infnet.orm.modelo.entidade;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue("N")
@PrimaryKeyJoinColumn(name = "produto_id")
public class Notebook  extends Produto{

	private String marca; 
	private String informacoes;
	private float valor;
	private boolean placaDeVideo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(boolean placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	
	
	
}
