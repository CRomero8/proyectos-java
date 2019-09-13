
package ejerciciotablas1;

import java.util.Scanner;

public class Ejerciciotablas1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);
        int t[],acu=0;
        t=new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Ingrese un número: ");
            t[i]=Entrada.nextInt();
            acu=acu+t[i];
        }
        for (int j=0;j<5;j++){
            System.out.println("Imprime los vectores: "+t[j]);
            System.out.println("total: "+acu);
        }
    }
    
}
