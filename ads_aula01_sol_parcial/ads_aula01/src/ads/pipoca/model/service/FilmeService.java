package ads.pipoca.model.service;

import java.io.IOException;
import java.util.ArrayList;

import ads.pipoca.model.dao.GeneroDAO;
import ads.pipoca.model.entity.Genero;

public class FilmeService {

		public int(Filme filme) throw IOException{
			FilmeDAO fdao = new FilmeDAO();
			return fdao.inserirFilme(filme);
		}
		public Filme buscarFilme(int id) throw IOException{
			FilmeDAO bdao = new FilmeDAO();
			return bdao.buscarFilme(id);
		}
		public Array(Filme filme) throw IOException{
			FilmeDAO adao= new FilmeDAO();
			return adao.listarFilme<>(filme);
		}
		public Filme excluirFilme(String titulo) throw IOException{
			FilmeDAO edao = new FilmeDAO();
			return edao.excluirFilme(titulo);
		}
}
