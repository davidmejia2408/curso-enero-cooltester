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
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 1");

			break;

		case 2:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 2");

			break;
		case 3:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 3");

			break;
		case 4:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 4");

			break;
		case 5:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 5");

			break;
		case 6:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 6");

			break;
		case 7:
			
			System.out.println("Usted ha seleccionado el ejercicio n�mero 7");

			break;

		default:
			
			System.out.println("Ese n�mero de ejercicio no se encuentra en la lista"+ "\n" +"Por favor intente de acuerdo al men� mostrado");
			
			break;
		}
		System.out.println("�Desea volver a elegir un ejercicio?"+ "\n" + "1. Si"+ "\n" +"2. No"+ "\n" +"Digita el n�mero de la opci�n deseada");
		int repetir = ref.nextInt();
		
		}while (repetir<2);			
			

	}
}
