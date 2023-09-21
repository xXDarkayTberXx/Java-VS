import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class alerus_Ejercicio7 {
	
	static float calcDiam(float radioCirculo) {
		
	    float calcDiam1 = radioCirculo * 2;
	    
		return calcDiam1;
		
	  }
	
static float calcCirc(float radioCirculo) {
		
	    float r2 = radioCirculo * radioCirculo;
	    float pi = (float) 3.1416;
		float calcCirc1 = pi * (radioCirculo * 2); 
	    
		return calcCirc1;
		
	  }
	
static float calcArea(float radioCirculo) {
		
	    float r2 = radioCirculo * radioCirculo;
	    float pi = (float) 3.1416;
		float calcArea1 = r2 * pi; 
	    
		return calcArea1;
		
	  }


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número (radio de tu círculo)");
		float RadioCirculo = sc.nextFloat();
		System.out.println("MENU");
		System.out.println("1) Calcular diámetro");
		System.out.println("2) Calcular circunferencia");
		System.out.println("3) Calcular area");
		int respuesta = sc.nextInt();
		
		switch (respuesta) {
			case 1:
				System.out.println("El diámetro es: " + calcDiam(RadioCirculo));
			break;
			
			case 2:
				System.out.println("La circunferencia es: " + calcCirc(RadioCirculo));
			break;
			
			case 3:
				System.out.println("El área es: " + calcArea(RadioCirculo));
			break;
			
			default:
				System.out.println("Selección inválida");
			break;
		}
		
		
		
		
		
	}

}
