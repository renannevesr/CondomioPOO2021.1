package br.upe.dao;

import br.upe.model.Servico;

public interface ServicoDAO {


	public class JPAServicoDAO extends GenericDAO<Servico, Long>{	

		public JPAServicoDAO() {
		       super(Servico.class);
		    }   
	
	}
}
