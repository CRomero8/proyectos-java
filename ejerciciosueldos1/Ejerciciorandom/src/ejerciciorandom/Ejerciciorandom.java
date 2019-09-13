
package ejerciciorandom;
import java.util.Scanner;
public class Ejerciciorandom {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        int n,i;
        System.out.print("INICIO DE JUEGO: ");
        n=tc.nextInt();       
        
        
        System.out.print("******************");
        System.out.print("PRIMER INTENTO");
        System.out.println("******************");      
        int c1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        for (i=0;i<c1;i++){
         System.out.print ("◘ ");  
        }
        System.out.println ("");
               
        int c2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        for (i=0;i<c2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int c3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        for (i=0;i<c3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
        
        
        int c4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        for (i=0;i<c4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int c5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        for (i=0;i<c5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
   
        System.out.print("Quiere seguir intentando: ");
        n=tc.nextInt();
    
        System.out.println("*************SEGUNDO INTENTO****************");
        int a1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int t1=c1+a1;
        for (i=0;i<t1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        int a2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int t2=c2+a2;
        for (i=0;i<t2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int a3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int t3=c3+a3;
        for (i=0;i<t3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
        
        int a4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int t4=c4+a4;
        for (i=0;i<t4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int a5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int t5=c5+a5;
        for (i=0;i<t5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
        
        System.out.print("quiere seguir intentando: ");
        n=tc.nextInt();
      
       System.out.println("*************TERCER INTENTO****************");
       int b1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int x1=c1+a1+b1;
        for (i=0;i<x1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        int b2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int x2=c2+a2+b2;
        for (i=0;i<t2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int b3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int x3=c3+a3+b3;
        for (i=0;i<t3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
              
        int b4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int x4=c4+a4+b4;
        for (i=0;i<x4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int b5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int x5=c5+a5+b5;
        for (i=0;i<x5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
       
        System.out.print("Quiere seguir intentando: ");
        n=tc.nextInt();
        
        System.out.println("*************CUARTO INTENTO****************");
        int d1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int y1=c1+a1+b1+d1;
        for (i=0;i<y1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        int d2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int y2=c2+a2+b2+d2;
        for (i=0;i<y2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int d3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int y3=c3+a3+b3+d3;
        for (i=0;i<y3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
              
        int d4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int y4=c4+a4+b4+d4;
        for (i=0;i<y4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int d5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int y5=c5+a5+b5+d5;
        for (i=0;i<y5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
        
        if (y1>=20||y2>=20||y3>=20||y4>=20||y5>=20){
            System.out.println ("HAY UN GANADOR");
        }else{
            System.out.println ("AUN NO HAY GANADOR");
            System.out.print("QUIERES SEGUIR INTENTANDO: ");
            n=tc.nextInt();
        }
        if (y1>=20&&y1<24){
            System.out.println ("WIN: caballo 1, "+y1+" PUNTOS");       
        }else if (y2>=20&&y2<24){
            System.out.println ("WIN: caballo 2, "+y2+" PUNTOS");
        }else if (y3>=20&&y3<24){
            System.out.println ("WIN: caballo 3, "+y3+" PUNTOS");
        }else if (y4>=20&&y4<24){
            System.out.println ("WIN: caballo 4, "+y4+" PUNTOS");
        }else if (y5>=20&&y5<24){
            System.out.println ("WIN: caballo 5, "+y5+" PUNTOS");
        }
            
        System.out.println("*************QUINTO INTENTO****************");
        int e1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int z1=c1+a1+b1+d1+e1;
        for (i=0;i<z1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        int e2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int z2=c2+a2+b2+d2+e2;
        for (i=0;i<z2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int e3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int z3=c3+a3+b3+d3+e3;
        for (i=0;i<z3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
              
        int e4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int z4=c4+a4+b4+d4+e4;
        for (i=0;i<z4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int e5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int z5=c5+a5+b5+d5+e5;
        for (i=0;i<z5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
        
        if (z1>=20||z2>=20||z3>=20||z4>=20||z5>=20){
            System.out.println ("HAY UN GANADOR");
        }else{
            System.out.println ("AUN NO HAY GANADOR");
            System.out.println ("ÚLTIMO INTENTO");
        }
        if (z1>=20&&z1<30){
            System.out.println ("WIN: caballo 1 ," + z1 +" PUNTOS");       
        }else if (z2>=20&&z2<30){
            System.out.println ("WIN: caballo 2 ," + z2 +" PUNTOS");
        }else if (z3>=20&&z3<30){
            System.out.println ("WIN: caballo 3 ," + z3 +" PUNTOS");
        }else if (z4>=20&&z4<30){
            System.out.println ("WIN: caballo 4 ," + z4 +" PUNTOS");
        }else if (z5>=20&&z5<30){
            System.out.println ("WIN: caballo 5 ," + z5 +" PUNTOS");
        }
        System.out.println("*************SEXTO Y ÚLTIMO INTENTO****************");
        int f1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int p1=c1+a1+b1+d1+e1+f1;
        for (i=0;i<p1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        int f2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int p2=c2+a2+b2+d2+e2+f2;
        for (i=0;i<p2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        int f3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int p3=c3+a3+b3+d3+e3+f3;
        for (i=0;i<p3;i++){
        System.out.print ("◘ ");
        }
        System.out.println ("");
              
        int f4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int p4=c4+a4+b4+d4+e4+f4;
        for (i=0;i<p4;i++){
         System.out.print ("◙ ");
        }
        System.out.println ("");
        
        int f5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int p5=c5+a5+b5+d5+e5+f5;
        for (i=0;i<p5;i++){
         System.out.print ("◘ ");
        }
        System.out.println ("");
        
        if (p1>=20||p2>=20||p3>=20||p4>=20||p5>=20){
            System.out.println ("HAY UN GANADOR");
        }         
        
        if (p1>=20&&p1<36){
            System.out.println ("WIN: caballo 1 ," + p1 +" PUNTOS");       
        }else if (p2>=20&&p2<36){
            System.out.println ("WIN: caballo 2 ," + p2 +" PUNTOS");
        }else if (p3>=20&&p3<36){
            System.out.println ("WIN: caballo 3 ," + p3 +" PUNTOS");
        }else if (p4>=20&&p4<36){
            System.out.println ("WIN: caballo 4 ," + p4 +" PUNTOS");
        }else if (p5>=20&&p5<36){
            System.out.println ("WIN: caballo 5 ," + p5 +" PUNTOS");
        }
    }
    
}
