package com.algoritmos;

public class Condicionales {
	
	
	public boolean acreditar(int asistencia, int calificacion)
	{
		final int totalAsist = 70;
		boolean paso = false;
		
		if (asistencia>=(totalAsist*.8) && calificacion>=60)
		{
			paso=true;
			return paso;
		}
		
		return false;
	}
    
	public int medio(int n1, int n2, int n3) {
			     
		if (n1<n2&&n1>n3||n1>n2&&n1<n3) {
			return n1;
		}else if(n2>n1&&n2<n3||n2<n1&&n2>n3) {
			return n2;
		}else {
			return n3;
		}
	
		}
	
	public  boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  if(numero==1)
			  return primo;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
	
	
		
}
