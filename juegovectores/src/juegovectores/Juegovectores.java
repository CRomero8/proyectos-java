
package juegovectores;

import java.util.Scanner;

public class Juegovectores {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Ingrese canticad de jugadores ");
        int x =Entrada.nextInt();
        int []juego=new int[x];
        int []juego2=new int[x];
        int []juego3=new int[x];
        int []juego4=new int[x];
        System.out.print("*****************************");
        System.out.print("=PRIMER INTENTO=");
        System.out.println("*****************************");
        int c=0;
        for(int i=0;i<x;i++){
            c=c+1;//donde c es el numeros de caballos
            juego[i]=(int)(Math.random()*6)+1;
            System.out.println("caballo "+c+": "+juego[i]);
              
        }
        System.out.print("*****************************");
        System.out.print("=SEGUNDO INTENTO=");
        System.out.println("*****************************");
        int p=0;
        for(int i=0;i<x;i++){
            p=p+1;//donde p es el numeros de caballos          
            juego2[i]=(int)(Math.random()*6)+1;
            int t2=juego[i]+juego2[i];
            System.out.println("caballo "+p+": "+juego2[i]+" + " +juego[i]+ " = "+t2);                 
        }
        System.out.print("*****************************");
        System.out.print("=TERCER INTENTO=");
        System.out.println("*****************************");
        int n=0;
        for(int i=0;i<x;i++){
            n=n+1;//donde n es el numeros de caballos          
            juego3[i]=(int)(Math.random()*6)+1;
            int t3=juego[i]+juego2[i]+juego3[i];
            System.out.println("caballo "+n+": "+juego2[i]+" + " +juego[i]+" + " +juego3[i]+  " = "+t3); 
        }
        System.out.print("*****************************");
        System.out.print("=CUARTO INTENTO=");
        System.out.println("*****************************"); 
        int m=0;
        for(int i=0;i<x;i++){
            m=m+1;//donde m es el numeros de caballos          
            juego4[i]=(int)(Math.random()*6)+1;
            int t4=juego[i]+juego2[i]+juego3[i]+juego4[i];
            System.out.print("caballo "+m+": "+juego2[i]+" + " +juego[i]+" + " +juego3[i]+" + " +juego4[i]+ " = "+t4); 
        
        if (t4>=20){
                System.out.println( " YOU WIN");
             
        }else if(t4<20){
            System.out.println( " LOSER");
        }
      
        }
        
        
    }
    
}
