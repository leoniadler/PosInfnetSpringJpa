package br.edu.infnet.appCompra;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import br.edu.infnet.orm.modelo.entidade.Notebook;
import br.edu.infnet.orm.modelo.entidade.Contato;
import br.edu.infnet.orm.modelo.entidade.Produto;
import br.edu.infnet.orm.modelo.entidade.Televisao;
import br.edu.infnet.orm.modelo.entidade.Celular;
import br.edu.infnet.orm.modelo.entidade.TipoContato;
import br.edu.infnet.orm.modelo.persistencia.ClienteDAO;
import br.edu.infnet.orm.modelo.persistencia.IDAO;
import br.edu.infnet.orm.modelo.persistencia.JpaUtil;
import br.edu.infnet.orm.modelo.persistencia.ProdutoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

    	
    	ProdutoDAO dao = new ProdutoDAO();

    	
    	Televisao televisao = new Televisao();
    	televisao.setCodigo(98);
    	televisao.setNome("HP");
    	televisao.setDefinicao(true);
    	
    	dao.salvar(televisao);
    	
    	Notebook notebook = new Notebook();
    	notebook.setCodigo(98);
    	notebook.setNome("HP");
    	notebook.setPlacaDeVideo(true);
    	
    	dao.salvar(notebook);
    	
    	
    	
    	Celular celular = new Celular();
    	celular.setNome("Iphone");
    	dao.salvar(celular);
    	
    	List<Notebook> listaProdutoPorTipo = dao.listaNotebook();
    	System.out.println(listaProdutoPorTipo);
    	
    	
    	
    	
    }
}
