package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;

public interface IDAO<T> {

	void salvar(T t);

	void atualizar(T t);

	void deletar(T t);

	T obter(Long id);

	List<T> listaTodos();

}