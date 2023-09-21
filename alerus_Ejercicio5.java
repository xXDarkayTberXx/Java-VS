import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL


public class alerus_Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número del 1 al 7:");
		int numeroint = sc.nextInt();
		
		
		if (numeroint == 1) {
		 
			System.out.println("Lunes");
			  
			}
		
		else
			
			if (numeroint == 2) {
		  
			  System.out.println("Martes");
			
			}
		
			else
				
				if (numeroint == 3) {
					System.out.println("Miercoles");
				}
				
				else
					
					if (numeroint == 4) {
						 System.out.println("Jueves");
					}
		
					else
						
						if (numeroint == 5) {
							 System.out.println("Viernes");
						}
					
						else
							
							if (numeroint == 6) {
								System.out.println("Sábado");
							}
			 
							else
								
								if (numeroint == 7) {
									 System.out.println("Domingo");
								}
		  
								else 
									
									System.out.println("Día inválido");	
		
		
	}

}
