package com.cursojava.curso.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerators;

/*
*Una entidad de persistencia, cuyo estado es persistido de
* manera asociada a una tabla en una base de datos relacional.
* Las instancias de estas entidades corresponden a un registro
* (conjunto de datos representados en una fila) en la tabla. */
@Entity
@Table(name = "usuarios") //Nombre de la tabla de la bd
@ToString @EqualsAndHashCode //para permitir que lombok genere implementaciones de los métodos equals(Object other) y hashCode(). De forma predeterminada
public class Usuario {
    @Id
/*Es algo bastante habitual ya que existen muchas tablas cuyas claves primarias preferimos que sean autoincrementales. Así pues solemos configurar
las entidades de JPA para que usen estas anotaciones.
* */
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se basa en una columna de base de datos con incremento automático y permite que la base de datos genere un nuevo valor con cada operación de inserción
    @Getter @Setter @Column(name = "id")// automaticamente genera los setter y getter
    private Long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
    @Getter @Setter @Column(name = "password")
    private String password;

}
