package com.entdes.pruebascodigo;

public class Evaluacion {
	public static void metodo1(int a){
		System.out.println("Pasado a:"+a);
	}
	public static String metodo2(String s){
		System.out.println("Pasado s:"+s);
		s=s+" "+s;
		if(s.toLowerCase().equals(s)){
			System.out.println("Ya est� en min�sculas");
		}
		s=s.toLowerCase();
		System.out.println("En min�sculas");
		s=s.toUpperCase();
		return s;
	}
	
	

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		String cad="Prueba de cadena";
		metodo2(cad);
		cad="otra prueba";
		metodo2(cad);
		

	}

}
