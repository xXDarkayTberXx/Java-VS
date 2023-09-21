import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL


public class alerus_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroint1 = 0;
		int numeroint2 = 0;
		
		do {
			System.out.println("Introduce el primer número: ");
			numeroint1 = sc.nextInt();
			System.out.println("Introduce el primer número: ");
			numeroint2 = sc.nextInt();
			
			} while (numeroint1 != numeroint2);
		
		System.out.println("Los números son iguales, programa terminado");
		
	}

}
