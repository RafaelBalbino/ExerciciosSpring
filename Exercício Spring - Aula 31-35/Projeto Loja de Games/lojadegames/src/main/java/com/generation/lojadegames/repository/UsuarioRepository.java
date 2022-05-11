package com.generation.lojadegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	
	// Quando temos mais de uma possível resposta, usamos o Optional.
	public Optional <Usuario> findByUsuario(String usuario);
}
