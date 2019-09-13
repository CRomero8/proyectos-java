
package ejerciciosueldos1;


import java.util.Scanner;

public class Ejerciciosueldos1 {

    public static void main(String[] args) {
        // sueldo con vectores
        Scanner Entrada=new Scanner(System.in);

        int i, t[],acum=0;
        t = new int[5];
        for (i=0;i<5;i++){
            System.out.print("Ingrese sueldo: ");
            t[i]=Entrada.nextInt();
            acum=acum+t[i];
        
        }
        for(int j=0;j<5;j++){
            System.out.println ("el sueldo " +j+" : " +t[j]);  
        }
        System.out.println ("El primer sueldo es: " +t[0]);
        System.out.println ("El Último sueldo es: "+t[4]); 
        System.out.println ("La suma de sueldos "+acum); 
        
        

    }
    
}
