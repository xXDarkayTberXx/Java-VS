import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class alerus_Ejercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana: ");
		String diaint = sc.next();
		
		switch (diaint) {
		
		case "Lunes":
			System.out.println("Psicomotricidad");
		break;
		
		case "Martes":
			System.out.println("Natación");
		break;
		
		case "Miercoles":
			System.out.println("Música");
		break;
		
		case "Jueves":
			System.out.println("Natación");
		break;
		
		case "Viernes":
			System.out.println("Descanso");
		break;
		
		case "Sabado":
			System.out.println("Descanso");
		break;
		
		case "Domingo":
			System.out.println("Descanso");
		break;
		
		default: 
			
			System.out.println("Día incorrecto");
		
		break;
		
		}
		
	}

}
