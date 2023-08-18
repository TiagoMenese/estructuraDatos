
package arreglo;

import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        //creacion del objeto tipo Scanner
       Scanner s = new Scanner(System.in);
       //declaracion de variables
       final int TAM = 10;
       int prod, suma = 0; 
       //creacion de arreglos
       int A[] = new int[TAM];
       int B[] = new int[TAM];
       //desarrollo del algoritmo
       for(int i = 0; i < TAM; i++){
           System.out.println("ingrese el numero "+(i+1)+" del arreglo A");
           A[i] = s.nextInt();
           System.out.println("ingrese el numero "+(i+1)+" del arreglo B");
           B[i] = s.nextInt();
           prod = A[i] * B[i];
           suma = suma + prod;
       }
        System.out.println("la sumatoria del producto entre los arreglos A y B es de: "+suma);
                
    }
    
}
