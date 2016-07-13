package com.bibloteca.entidades;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn; //PK
	private int numeroPaginas;
	private int estado;
	
	public Libro() {
		super();
	}
	
	public Libro(String titulo, String autor, String isbn, int numeroPaginas, int estado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	// TODO Habra que definir Equals y Hascode
}
