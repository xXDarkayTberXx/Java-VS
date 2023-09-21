import java.util.Scanner;

public class alerus_Ejercicio11 {
    
    static long factorial(long n) { //LONG Deja poner números más grandes
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        long N = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        long N2 = sc.nextInt();

        
        
        if (N > N2) {
        	
            for (long i = N; i >= 1; i--) {
            	System.out.println("El factorial de " + i + " es " + factorial(i));
            }
        } else 
        	
        	if (N2 > N) {
        		
            for (long i = N2; i >= 1; i--) {
                System.out.println("El factorial de " + i + " es " + factorial(i));
            }
        } else 
        
            System.out.println("No válido.");
    }
}