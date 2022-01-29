package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Datos primitivos

		byte var1 = 1; // Numerico entero
		short var2 = 1; // Numerico entero
		int var3 = 1; // Numerico entero (Entero) - Automation
		long var4 = 1L; // Numerico entero - Automation
		float var5 = 1.2f; // Numerico real
		double var6 = 2.223; // Numerico real (decimales) - Automation
		char var7 = 'a'; // Caracter - Automation
		boolean var8 = true; // Boleano - Automation - tiene dos valores TRUE / FALSE

		// Declarar variables
		int x;
		x = 10000;

		int y = 10;

		// Char symbol example
		char symbol = '\u00A9';

		// Cadena Char
		String message = "Hello world"; // - Automation

		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);

		// Concatenacion, Se representa con el signo +
		System.out.println(message + symbol);

		int numero = 1;
		String nombre = "Ricardo";
		System.out.println(nombre + numero);

		// OPERATORS

		// Operadores aritmeticos
		int x = 2;
		int y = 2;

		int suma = x + y;
		int resta = x - y;
		int mult = x * y;
		int div = x / y;

		double z = 2.23;
		double a = 4.34;

		double mult2 = z * a;

		System.out.println("Esta es la suma " + suma);
		System.out.println("Esta es la resta " + resta);
		System.out.println("Esta es la mult " + mult);
		System.out.println("Esta es la div " + div);

		System.out.println("El valor double es " + mult2);

		// Operadores Unarios
		int unario = 2;
		++unario;
		System.out.println(unario);

		// Operadores relacionales
//				Igual que ==
//				Diferente a !=
//				Mayor que >
//				Mayor o igual que >=
//				Menos que <
//				Menor o igual que <=

		int or = 2;
		int or2 = 3;

		if (or != or2) {
			System.out.println("TRUE");
		} else {
			System.out.println("False");
		}

		String msg = "Hello";
		String msg2 = "Hello";

		if (msg != msg2) {
			System.out.println("String TRUE");
		} else {
			System.out.println("String False");
		}

		// Operadores condicionales
//				 AND &&
//				 OR ||

		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 4;
		int oper4 = 3;

		if (oper1 == oper2 && oper3 == oper4 && msg == msg2) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}

		if (oper1 == oper2 || oper3 == oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}

	}
}
