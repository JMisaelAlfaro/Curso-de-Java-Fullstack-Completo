package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository //hace referencia quien va a tener la funcionalidad de poder acceder al repositorio de la base de datos
@Transactional //hace referencia de la forma como va tratar lsa consultas de sql como las va armar y ejecutar
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario"; // se pone el nombre de la clase
        return  entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }


}
