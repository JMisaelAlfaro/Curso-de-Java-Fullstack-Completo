/* Los CONTROLADORES sirven para manejar las URL´S
   hacemos que devuelva una cosa (/direccion), sirven para manejar direcciones de url
* */

package com.cursojava.curso.controller;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController { //LA CLASE ES UN CONTROLADOR
    //inyeccion de dependencias
    @Autowired //Automaticamente hace que la clase UsuarioDao implements se cree un objeto y la guarda dentro de la variable UsuarioDao usuarioDao
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public Usuario getUsuario(@PathVariable Long id) { //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Misael");
        usuario.setApellido("Alfaro");
        usuario.setEmail("misa_caba10@hotmail.com");
        usuario.setTelefono("5583653087");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios" , method = RequestMethod.GET)//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public List<Usuario> getUsuarios() { //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
       return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios" , method = RequestMethod.POST)//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public void registrarUsuario(@RequestBody Usuario usuario) { //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
         usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuario123" )//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public Usuario editar(){ //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
        Usuario usuario  = new Usuario();
        usuario.setNombre("Misael");
        usuario.setApellido("Alfaro");
        usuario.setEmail("misa_caba10@hotmail.com");
        usuario.setTelefono("5583653087");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public void eliminar(@PathVariable Long id){ //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "usuario789" )//LA URL PARA REGRESAR EL CONTENIDO DE DICHA FUNCION
    public Usuario buscar(){ //GENERACION DE UNA FUNCION EN ESTE CASO UNA LISTA
        Usuario usuario  = new Usuario();
        usuario.setNombre("Misael");
        usuario.setApellido("Alfaro");
        usuario.setEmail("misa_caba10@hotmail.com");
        usuario.setTelefono("5583653087");
        return usuario;
    }
}
