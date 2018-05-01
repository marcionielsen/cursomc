package br.com.marcionielsen.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcionielsen.cursomc.domain.Categoria;
import br.com.marcionielsen.cursomc.repositories.interfaces.ICategoriaRepository;
import br.com.marcionielsen.cursomc.services.interfaces.IGenericaService;

@Service
public class CategoriaService implements IGenericaService<Categoria> {

	@Autowired
	private ICategoriaRepository  repo;
	
	@Override
	public Categoria findById(Long id) {
		Optional<Categoria> categoria = repo.findById(id);
		
		return categoria.orElse(null);
	}

	@Override
	public List<Categoria> listAll() {
		List<Categoria> listaCategorias = repo.findAll();
		
		return listaCategorias;
	}

	@Override
	public Categoria inserir(Categoria obj) {
		return null;
	}

	@Override
	public Categoria editar(Categoria obj) {
		return null;
	}

	@Override
	public void excluir(Long id) {
		
	}
	
	
	
	
	
	
}
