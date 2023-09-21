import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class alerus_Ejercicio6 {
	
	static float calculadora(float tiempo) {
	    
		float gravedad = (float) 9.8;
		
		float velocidad = tiempo * gravedad;
		
		return velocidad;
		
		
	  }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor del tiempo: ");
		float tiempo = sc.nextInt();
		
		if (tiempo <= 0 ) {
			System.out.println("Tiempo incorrecto");
		}
		else
			
			System.out.println("La velocidad es: "  + calculadora(tiempo));
			
		
	}

}
