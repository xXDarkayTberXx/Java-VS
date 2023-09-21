//Comienzo 

import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL


public class alerus_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero1 = 0; //Declaración de variables
		int numero2 = 0;
		
		System.out.println("Introduce el primer número: "); //Impresión de algo en nueva línea
		numero1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: "); 
		numero2 = sc.nextInt();
		
		if (numero1 > numero2) //COMPROBACION DE CONDICIONES
			System.out.println(numero1 + " es mayor que " + numero2);
		else
			if (numero1 < numero2)
				System.out.println(numero2 + " es mayor que " + numero1);
			else 
				System.out.println("Los números son iguales");
		sc.close(); //FIN DEL IF
		
	}

}
