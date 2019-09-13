
package ejercicionotasprom;

import java.util.Scanner;

public class Ejercicionotasprom {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);
        float [] n;
        float prom,acu=0,apro=0,desa=0,acua=0,acud=0,proma,promd;
        n=new float[5];       
        for (int i=0;i<5;i++){
            System.out.print("INGRESE NOTAS DEL 0 A 20: ");
            n[i]=Entrada.nextFloat();
            acu=acu+n[i];
            if (n[i]>10&&n[i]<21){                
                apro++; 
                acua=acua+n[i];
            }else{
                desa++;
                acud=acud+n[i];
                } 
        }
        prom=acu/5;
        proma=acua/apro;
        promd=acud/desa;
        System.out.println("PROMEDIO TOTAL:        "+prom);
        System.out.println("APROBADOS:             "+apro);
        System.out.println("DESAPROBADOS:          "+desa);
        System.out.println("PROMEDIO APROBADOS:    "+proma);  
        System.out.println("PROMEDIO DESAPROBADOS: "+promd);
        for(int i=0;i<5;i++){
            if (n[i]>10){
               System.out.println("NOTAS APROBADAS: "+n[i]); 
            }
        }
        for(int i=0;i<5;i++){
            if (n[i]<11){
               System.out.println("NOTAS DESAPROBADAS: "+n[i]); 
            }
        }
    }
    
}
