
package lab2p1_eduardochinchilla;

import java.util.Scanner;

public class Lab2P1_EduardoChinchilla {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Menu");
            System.out.println("1. Numero Perfecto");
            System.out.println("2. Sumatoria");
            System.out.println("3. Serie");
            System.out.println("4. Salir");
            
            opcion = read.nextInt();
            
            if (opcion == 1) {
                System.out.println("Ingrese un numero: ");
                int num = read.nextInt();
                boolean f = false;
                int i = 1;
                int cont = 0;
            
                if (num%i==0){
                    System.out.println("Divisores: "+i);
                }
                    
                while (i <=num){
                    if (num%i==0){
                        cont = cont + 1;
                        
                    }
                    i = i +1;
                }
                if (cont == 2){
                    f = true;
                    System.out.println("El numero es primo, no se pudo realizar calculos por falta de divisores");
                } else {
                    System.out.println("Es un numero perfecto");
                   
                }
                    
                
            } else if (opcion ==2) {
                System.out.println("Ingrese un numero: ");
                double k = read.nextInt();
                double n = 0; int cont = 0;
                double sumatoria = 0; 
                while (cont < k){
                    n = cont+1;
                  
                    sumatoria = sumatoria + (((2*n)-1)/(n*(n+1)));
                    cont ++;
                }
                System.out.println(sumatoria);
                
            } else if  (opcion == 3){
                System.out.println("Ingrese un numero: ");
                int x = read.nextInt();
                System.out.println("Ingrese el limite: ");
                int limit = read.nextInt();
                int acum = 0;
                int cont = 0;
                int n=0;
                int signo= 1;
                
                while (cont <= limit){
                    signo=signo*(-1);
                    n=(cont)*(signo);
                    if (cont==0){
                     System.out.println("0 1");
                    }else if (cont>0){
                        System.out.println(n*x);
                    }
               
                    acum +=1;
                    cont ++;
                }
                
            } else if (opcion == 4) {
            System.out.println("Ha salido del menu");
        }
                    
            
            
            
     
            
        }
        

    }
}
