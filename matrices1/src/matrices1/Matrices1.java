
package matrices1;

import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int [][] num=new int[3][3];
          Scanner numero=new Scanner(System.in);
          System.out.println("Ingrese los numeros: ");
          for (int i=0;i<num.length; i++){
              for(int j=0;j<num.length;j++){
          num[i][j]=numero.nextInt();
              } 
          }
          System.out.println("Imprimiendo tabla.");
          for (int i=0;i<num.length;i++){
              System.out.println();
              for (int j=0;j<num.length;j++){
                  System.out.print(num[i][j]+" ");
              }
          }
          
           System.out.println(" ");
          
    }
    
}
