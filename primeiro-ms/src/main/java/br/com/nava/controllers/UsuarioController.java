package br.com.nava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nava.entities.UsuarioEntity;

@RestController
public class UsuarioController {

	@GetMapping ("usuario")
	public UsuarioEntity getUsuario() {
		UsuarioEntity e = new UsuarioEntity(1, "Luiza", "malumoura10@gmail.com");
		
		return e;
	}
}
