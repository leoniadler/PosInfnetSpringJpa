package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Notebook;
import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.entidade.Televisao;
import br.edu.infnet.orm.modelo.entidade.Celular;

public class ProdutoDAO extends JpaDAO<Produto>  {

//	public List<Produto> obterPeloNomeProduto(String nome){
//		return null;
//	}
	
	public List<Produto> listaProdutoPorTipo(){
		return em.createQuery("From Produto").getResultList();
	}
	
	public List<Notebook> listaNotebook(){
		return em.createQuery("From Notebook").getResultList();
	}
	
	public List<Celular> listaCeluar(){
		return em.createQuery("From Celular").getResultList();
	}
	
	public List<Televisao> listaTelevisao(){
		return em.createQuery("From Televisao").getResultList();
	}
}
