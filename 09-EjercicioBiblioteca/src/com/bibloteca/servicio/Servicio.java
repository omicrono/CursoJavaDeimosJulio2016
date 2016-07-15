package com.bibloteca.servicio;

import com.bibloteca.entidades.Libro;
import com.bibloteca.entidades.Usuario;

public interface Servicio {
	void altaLibro(Libro libro) throws Exception;
	void altaUsuario(Usuario usuario) throws Exception;
	void prestar(Libro libro, Usuario usuario) throws Exception;
	void devolver(Libro libro, Usuario usuario) throws Exception;
	void reservar(Libro libro, Usuario usuario) throws Exception;
}
