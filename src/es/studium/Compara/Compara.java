package es.studium.Compara;

import java.util.Scanner;

public class Compara {
	public static void main(String[] args) {
		int numero1,numero2;
		//Creamos el objeto Scanner conectado al teclado
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un n�mero entero");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero entero");
		numero2 = teclado.nextInt();
		teclado.close();
		if(numero1==numero2)
		{
			System.out.println("Son iguales ");
		}
		else
		{
			if(numero1>numero2)
			{
				System.out.println("El n�mero 1 es mayor que el n�mero 2");
			}
			else
			{
				System.out.println("El n�mero 2 es mayor que el numero 1");
			}
		}
	}
}

