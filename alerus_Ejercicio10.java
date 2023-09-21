import java.util.Scanner; //IMPORTATE EN CADA SCRIPT ME DA IGUAL

public class alerus_Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int posi = 0;
		int nega = 0;
		int zero = 0;
		
		
		do {
			
			System.out.println("Introduce número");
			int numint = sc.nextInt();
			
			if (numint > 0) {
				
				posi = posi + 1;
				
			}	else 
					
					if (numint < 0) {
						nega = nega + 1;
						
					} else
							
							zero = zero + 1;
					
			i =  i + 1;
			
		} while (i < 10);
		
		System.out.println("Has introducido " + posi + " números positivos");
		System.out.println("Has introducido " + nega + " números negativos");
		System.out.println("Has introducido " + zero + " ceros");
		
	}

}
