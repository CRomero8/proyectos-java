
package ejerciciorandom;
import java.util.Scanner;
public class Ejerciciorandom {

    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;
        int c1,c2,c3,c4,c5;
        int a1,a2,a3,a4,a5;
        int b1,b2,b3,b4,b5;
        int d1,d2,d3,d4,d5;
        int e1,e2,e3,e4,e5;
        System.out.println("PRIMER INTENTO");
        c1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        for (i=0;i<c1;i++){
         System.out.print ("◘ ");  
        }
        System.out.println ("");
        
       
        c2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        for (i=0;i<c2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        c3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        for (i=0;i<c3;i++){
        System.out.print ("☼ ");
        }
        System.out.println ("");
        
        
        c4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        for (i=0;i<c4;i++){
         System.out.print ("☻ ");
        }
        System.out.println ("");
        
        c5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        for (i=0;i<c5;i++){
         System.out.print ("► ");
        }
        System.out.println ("");
        Scanner tc = new Scanner(System.in);
        System.out.print("quiere seguir intentando: ");
        n=tc.nextInt();
        
        System.out.println("SEGUNDO INTENTO");
        a1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int t1=c1+a1;
        for (i=0;i<t1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        a2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int t2=c2+a2;
        for (i=0;i<t2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        a3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int t3=c3+a3;
        for (i=0;i<t3;i++){
        System.out.print ("☼ ");
        }
        System.out.println ("");
        
        
        a4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int t4=c4+a4;
        for (i=0;i<t4;i++){
         System.out.print ("☻ ");
        }
        System.out.println ("");
        
        a5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int t5=c5+a5;
        for (i=0;i<t5;i++){
         System.out.print ("► ");
        }
        System.out.println ("");
        
        System.out.print("quiere seguir intentando: ");
        n=tc.nextInt();
        
       System.out.println("TERCER INTENTO"); 
       b1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int x1=c1+a1+b1;
        for (i=0;i<x1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        b2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int x2=c2+a2+b2;
        for (i=0;i<t2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        b3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int x3=c3+a3+b3;
        for (i=0;i<t3;i++){
        System.out.print ("☼ ");
        }
        System.out.println ("");
        
        
        b4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int x4=c4+a4+b4;
        for (i=0;i<x4;i++){
         System.out.print ("☻ ");
        }
        System.out.println ("");
        
        b5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int x5=c5+a5+b5;
        for (i=0;i<x5;i++){
         System.out.print ("► ");
        }
        System.out.println ("");
       
        System.out.print("quiere seguir intentando: ");
        n=tc.nextInt();
        
        System.out.println("CUARTO INTENTO");
        d1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int y1=c1+a1+b1+d1;
        for (i=0;i<y1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        d2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int y2=c2+a2+b2+d2;
        for (i=0;i<y2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        d3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int y3=c3+a3+b3+d3;
        for (i=0;i<y3;i++){
        System.out.print ("☼ ");
        }
        System.out.println ("");
        
        
        d4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int y4=c4+a4+b4+d4;
        for (i=0;i<y4;i++){
         System.out.print ("☻ ");
        }
        System.out.println ("");
        
        d5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int y5=c5+a5+b5+d5;
        for (i=0;i<y5;i++){
         System.out.print ("► ");
        }
        System.out.println ("");
        if (y1>=20){
            System.out.println ("win caballo 1");
        
        }else if (y2>=20){
            System.out.println ("win: caballo 2");
        }else if (y3>=20){
            System.out.println ("win: caballo 3");
        }else if (y4>=20){
            System.out.println ("win: caballo 4");
        }else if (y5>=20){
            System.out.println ("win: caballo 5");
        }else
            System.out.println ("todavia no hay ganador");
        
        System.out.print("quiere seguir intentando: ");
        n=tc.nextInt();
        
        System.out.println("QUINTO INTENTO");
        e1=(int)(Math.random()*6)+1;
        System.out.print("Caballo 1: ");
        int z1=c1+a1+b1+d1+e1;
        for (i=0;i<z1;i++){ 
         System.out.print ("◘ ");  
        }
        System.out.println ("");
              
        e2=(int)(Math.random()*6)+1;
        System.out.print("Caballo 2: ");
        int z2=c2+a2+b2+d2+e2;
        for (i=0;i<z2;i++){
         System.out.print ("◙ ");
        }
        System.out.println (""); 
        
        e3=(int)(Math.random()*6)+1;
        System.out.print("Caballo 3: ");
        int z3=c3+a3+b3+d3+e3;
        for (i=0;i<z3;i++){
        System.out.print ("☼ ");
        }
        System.out.println ("");
        
        
        e4=(int)(Math.random()*6)+1;
        System.out.print("Caballo 4: ");
        int z4=c4+a4+b4+d4+e4;
        for (i=0;i<z4;i++){
         System.out.print ("☻ ");
        }
        System.out.println ("");
        
        e5=(int)(Math.random()*6)+1;
        System.out.print("Caballo 5: ");
        int z5=c5+a5+b5+d5+e5;
        for (i=0;i<z5;i++){
         System.out.print ("► ");
        }
        System.out.println ("");
    }
    
}
