package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;
import java.util.function.LongToIntFunction;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);
}
