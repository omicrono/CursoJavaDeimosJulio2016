package com.curso.java.persistencia;

import com.curso.java.entidades.Factura;

public interface FacturaDao extends Dao<Factura> {

	Factura consultarPorCuantia(int cuantia);
	
}
