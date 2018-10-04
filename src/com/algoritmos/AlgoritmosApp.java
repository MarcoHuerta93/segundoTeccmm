package com.algoritmos;

import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int exp = 0;
		int calificacion = 0;
		int asistencia = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
Ciclos ciclo = new Ciclos();
Condicionales condicion = new Condicionales();
//		/*pedir base y exponente4*/
//		System.out.println("Dame la base");
//		base = sc.nextInt();
//		System.out.println("Dame el exponente");
//		exp = sc.nextInt();
//		System.out.println("El resultado es:" +ciclo.potencia(base, exp));
//		
//		
//		/*Decir si el alumno paso o no, de acuerdo a calificacion y asistencias*/
//		System.out.println("Cual es tu calificacion");
//		calificacion = sc.nextInt();
//		
//		System.out.println("Cuantas asistencias tienes");
//		asistencia = sc.nextInt();
//		
//		System.out.println("Pasaste: "+condicion.acreditar(asistencia, calificacion));
		
		
		/*Decir si el alumno paso o no, de acuerdo a calificacion y asistencias*/
		/*System.out.println("Ingresa primer numero ");
		n1 = sc.nextInt();
		
		System.out.println("Ingresa segundo numero");
		n2 = sc.nextInt();
		
		System.out.println("Ingresa tercer numero");
		n3 = sc.nextInt();
		
		System.out.println("El numero de medio es: " + condicion.medio(n1, n2, n3));*/
       int numero = 0;
        System.out.println("Ingresar numero");
        numero = sc.nextInt();
        System.out.println("Resultado:" +condicion.esPrimo(numero));



	}

}
