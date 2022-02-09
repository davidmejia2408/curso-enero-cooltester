package com.java;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		Scanner ref = new Scanner(System.in);
		
		do{
			
		System.out.println("Por favor ingresa el ejerciio a visualizar");
		int ejercicio = ref.nextInt();
		

		switch (ejercicio) {
		case 1:
			
			System.out.println("Usted ha seleccionado el ejercicio número 1");

			break;

		case 2:
			
			System.out.println("Usted ha seleccionado el ejercicio número 2");

			break;
		case 3:
			
			System.out.println("Usted ha seleccionado el ejercicio número 3");

			break;
		case 4:
			
			System.out.println("Usted ha seleccionado el ejercicio número 4");

			break;
		case 5:
			
			System.out.println("Usted ha seleccionado el ejercicio número 5");

			break;
		case 6:
			
			System.out.println("Usted ha seleccionado el ejercicio número 6");

			break;
		case 7:
			
			System.out.println("Usted ha seleccionado el ejercicio número 7");

			break;

		default:
			
			System.out.println("Ese número de ejercicio no se encuentra en la lista"+ "\n" +"Por favor intente de acuerdo al menú mostrado");
			
			break;
		}
		System.out.println("¿Desea volver a elegir un ejercicio?"+ "\n" + "1. Si"+ "\n" +"2. No"+ "\n" +"Digita el número de la opción deseada");
		int repetir = ref.nextInt();
		
		}while (repetir<2);			
			

	}
}
