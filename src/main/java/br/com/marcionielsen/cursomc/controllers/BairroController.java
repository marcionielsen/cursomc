package br.com.marcionielsen.cursomc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcionielsen.cursomc.controllers.interfaces.IGenericaController;
import br.com.marcionielsen.cursomc.domain.Bairro;
import br.com.marcionielsen.cursomc.services.BairroService;

@RestController
@RequestMapping(value = "/bairros")
public class BairroController implements IGenericaController<Bairro> {

	@Autowired
	private BairroService bairroService;

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Long id) {

		Bairro bairro = bairroService.findById(id);
		return ResponseEntity.ok().body(bairro);
	}

	@Override
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listAll() {

		List<Bairro> lista = bairroService.listAll();
		return ResponseEntity.ok().body(lista);

	}

	@Override
	public Bairro inserir(Bairro obj) {
		return null;
	}

	@Override
	public Bairro editar(Bairro obj) {
		return null;
	}

	@Override
	public void excluir(Long id) {

	}

}
