import java.util.Scanner;

public class alerus_Ejercicio13 {
    
    static int compruebaprimos(int n) { 
       
    	Boolean esPrimo = true;
    	
    	for (int i = n; i >= 1; i--) {
    		if (n % i == 0) {	
    			if (i != n && i != 1) {	
    				esPrimo = false;	
    			}
    			System.out.println(n + " es divisible entre " + i );
    		}
    	}
    	
    		if (esPrimo == true) {
    		
    			System.out.println("Es primo");
    		
    	}	else
    		
    		
    		System.out.println("No es primo");
    	
		return n;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número: ");
        int N = sc.nextInt();
        
        int respuestan = compruebaprimos(N);
        
    }  
}