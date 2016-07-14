package com.curso.java.persistencia;

import java.io.Serializable;

import com.curso.java.entidades.Entidad;

public interface Dao<E extends Entidad & Serializable> {
	void insertar(E  entidad);
}
