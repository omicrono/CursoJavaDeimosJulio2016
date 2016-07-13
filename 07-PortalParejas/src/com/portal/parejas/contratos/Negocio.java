package com.portal.parejas.contratos;

import com.portal.parejas.entidades.Persona;

public interface Negocio {

	boolean esAfin(Persona elQueBusca, Persona candidato);
	
	boolean esIdeal(Persona elQueBusca, Persona candidato);
	
	void envioCorreoElectronico(Persona remitente, Persona destinatario);
	
}
