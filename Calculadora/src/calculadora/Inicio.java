/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Inicio {
    public float r;
    public float areaCirculo;
    public float perimetroCirculo;
   
    public Inicio(float r,float areaCirculo,float perimetroCirculo) {
        this.r = r;
        this.areaCirculo=areaCirculo;
        this.perimetroCirculo=perimetroCirculo;
    }
    public void menu() {
        int opcion;
        int opcion2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bienvenido");
            System.out.println("[1]-Circulo");
            System.out.println("[2]-Triangulo");
            System.out.println("[3]-cuadrado");
            System.out.println("[4]-Rectangulo");
            System.out.println("[0]-Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Circulo");
                    System.out.println("[1]-Area");
                    System.out.println("[2]-Perimetro");
                    opcion2 = sc.nextInt();
                    menu2(opcion2);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
        } while (opcion != 0);
    }

    public void menu2(int n) {
        float d;
        Scanner ff=new Scanner(System.in);
        switch(n){
            case 1:
                System.out.println("Ingresa radio");
                r=ff.nextFloat();
                areaCirculo=(float) (3.14*r*r);
                System.out.println("El area del circulo es:"+areaCirculo);
                break;
            case 2:
                System.out.println("Ingrese Radio");
                r=ff.nextFloat();
                d=r+r;
                perimetroCirculo=(float) ((3.14)*(d));
                System.out.println("El perimetro del circulo es:"+perimetroCirculo);
                break;
            default: System.out.println("Error");
            
        }
        
    
    
    }
    
    
    
}
