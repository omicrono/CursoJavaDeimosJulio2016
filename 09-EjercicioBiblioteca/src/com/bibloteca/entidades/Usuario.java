package com.bibloteca.entidades;

import java.util.Collection;
import java.util.LinkedList;

public class Usuario {
	
	private int id = 0;
	private String nombre = null;
	private String password = null;
	private Collection<Libro> librosPrestados = new LinkedList<Libro>();
	private Collection<String> librosReservados = new LinkedList<String>();
	
	public Usuario(int id, String nombre, String password, Collection<Libro> librosPrestados,
			Collection<String> librosReservados) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.librosPrestados = librosPrestados;
		this.librosReservados = librosReservados;
	}
	public Usuario() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Libro> getLibrosPrestados() {
		return librosPrestados;
	}
	public void addLibrosPrestados(Collection<Libro> librosPrestados) {
		this.librosPrestados.addAll(librosPrestados);
	}
	public void addLibroPrestado(Libro libroPrestado) {
		this.librosPrestados.add(libroPrestado);
	}
	public void removeLibroPrestado(Libro libroPrestado) {
		this.librosPrestados.remove(libroPrestado);
	}
	
	public Collection<String> getLibrosReservados() {
		return librosReservados;
	}
	public void addLibrosReservados(Collection<String> librosReservados) {
		this.librosReservados.addAll(librosReservados);
	}
	public void addLibroReservado(String libroReservado) {
		this.librosReservados.add(libroReservado);
	}
	public void removeLibroReservado(String libroReservado) {
		this.librosReservados.remove(libroReservado);
	}
	
	// TODO el equals y el hashcode

}
