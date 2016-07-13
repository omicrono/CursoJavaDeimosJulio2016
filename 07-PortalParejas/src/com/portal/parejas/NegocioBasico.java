package com.portal.parejas;

import com.portal.parejas.contratos.Negocio;
import com.portal.parejas.entidades.Persona;

public class NegocioBasico implements Negocio {

	@Override
	public boolean esAfin(Persona elQueBusca, Persona candidato) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esIdeal(Persona elQueBusca, Persona candidato) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void envioCorreoElectronico(Persona remitente, Persona destinatario) {
		// TODO Auto-generated method stub
		
	}

}
