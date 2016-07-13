package com.curso.java;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion {

	public static void main(String[] args) {

		Persona persona = new Persona(1, "victor");
		
		Persona persona2 = new Persona(1, "juan");
		
		//persona2 = persona;
		
		if(persona.equals(persona2)){
			System.out.println("Esto solo se pinta si se ha implementado el metodo equals considerando solo el atributo id");
		}
		
		System.out.println("Se acabo la aplicacion");
		
		//List
		
		List<Persona> list = new LinkedList<>();
		
		list.add(persona);
		list.add(persona);
		list.add(persona2);
		
		Persona persona3 = list.get(0);
		
		if (persona.getNombre().equals(persona3.getNombre())){
			System.out.println("Como el objeto es el mismo, tiene el mismo nombre");
		}
		
		Persona persona6 = new Persona(2, "Maria");
		
		list.add(1, persona6);
		
		for (Persona persona4 : list) {
			System.out.println(persona4.toString());
		}
		
		System.out.println("**************************");

		//Set
		
		Set<Persona> set = new HashSet<>();
		
		set.add(persona);
		set.add(persona2);
		
		for (Persona persona4 : set) {
			System.out.println(persona4);
		}
		
		//Queue
		
		//Podemos hacer el casting porque el objeto relamente es un LinkedList, 
		//que cumple tanto con List como Deque
		Deque<Persona> cola = (Deque<Persona>) list;
		
		cola.push(persona);
		
		Persona persona4 = cola.pop();
		
		//Map
		
		Map<Integer, Persona> map = new HashMap<>();
		
		map.put(persona.getId(), persona);
		
		Persona persona5 = map.get(persona.getId());
		
		Set<Integer> keySet = map.keySet();
		
		Collection<Persona> values = map.values();
		
		System.out.println("**************************");
		
		//TreeSet
		
		TreeSet<Persona> treeSet = new TreeSet<>(new PersonaOrdenAlfabeticoInversoComparator());
		
		treeSet.add(persona6);
		treeSet.add(persona);
		
		
		for (Persona persona7 : treeSet) {
			System.out.println(persona7);
		}
		
		//Collections
		
		Collections.shuffle(list);// Coloca de forma aleatoria los elementos de la coleccion

	}

}
