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
    public float Base;
    public float Altura;
    public float AreaTriangulo;
    public float PerimetroTriangulo;
    public float Lado;
    public float AreaCuadrado;
    public float PerimetroCuadrado;
    public float AreaRectangulo;
    public float PerimetroRectangulo;
    public float LadoA;
    public float LadoB;

    public Inicio(float AreaCuadrado, float AreaRectangulo, float PerimetroCuadrado, float PerimetroRectangulo, float LadoA, float LadoB, float Lado, float PerimetroTriangulo, float AreaTriangulo, float Altura, float r, float areaCirculo, float perimetroCirculo, float Base) {
        this.r = r;
        this.Lado = Lado;
        this.PerimetroTriangulo = PerimetroTriangulo;
        this.Base = Base;
        this.AreaTriangulo = AreaTriangulo;
        this.Altura = Altura;
        this.areaCirculo = areaCirculo;
        this.perimetroCirculo = perimetroCirculo;
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.AreaRectangulo = AreaRectangulo;
        this.AreaCuadrado = AreaCuadrado;
        this.PerimetroRectangulo = PerimetroRectangulo;
        this.PerimetroCuadrado = PerimetroCuadrado;
    }

    public void menu() {
        int opcion, opcion2, opcion3, opcion4, opcion5;
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
                    Circulo(opcion2);
                    break;
                case 2:
                    System.out.println("Triangulo");
                    System.out.println("[1]-Area");
                    System.out.println("[2]-Perimetro");
                    opcion3 = sc.nextInt();
                    Triangulo(opcion3);
                    break;
                case 3:
                    System.out.println("Cuadrado");
                    System.out.println("[1]-Area");
                    System.out.println("[2]-Perimetro");
                    opcion4 = sc.nextInt();
                    Cuadrado(opcion4);
                    break;
                case 4:
                    System.out.println("Rectangulo");
                    System.out.println("[1]-Area");
                    System.out.println("[2]-Perimetro");
                    opcion5 = sc.nextInt();
                    Rectangulo(opcion5);
                    break;
                default:
            }
        } while (opcion != 0);
    }

    public void Circulo(int n) {
        float d;
        Scanner ff = new Scanner(System.in);
        switch (n) {

            case 1:
                System.out.println("Ingresa radio");
                r = ff.nextFloat();
                areaCirculo = (float) (3.14 * r * r);
                System.out.println("El area del circulo es:" + areaCirculo);
                break;
            case 2:
                System.out.println("Ingrese Radio");
                r = ff.nextFloat();
                d = r + r;
                perimetroCirculo = (float) ((3.14) * (d));
                System.out.println("El perimetro del circulo es:" + perimetroCirculo);
                break;
            default:
                System.out.println("Error");

        }

    }

    public void Triangulo(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Base");
                Base = ff.nextFloat();
                System.out.println("Ingrese Altura");
                Altura = ff.nextFloat();
                AreaTriangulo = Base * Altura / 2;
                System.out.println("El area del triangulo es de:" + AreaTriangulo);
                break;
            case 2:
                //triangulo equilatero tiene todos sus lados iguales 
                System.out.println("Ingrese Lado del triangulo Equilátero:");
                Lado = ff.nextFloat();
                PerimetroTriangulo = Lado * 3;
                System.out.println("El perimetro del triangulo es de:" + PerimetroTriangulo);
                break;
            default:
                System.out.println("Error");

        }

    }

    public void Cuadrado(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Lado A");
                LadoA = ff.nextFloat();
                System.out.println("Ingrese Lado B");
                LadoB = ff.nextFloat();
                AreaCuadrado = LadoA * LadoB;
                System.out.println("El area del Cuadrado es de:" + AreaCuadrado);
                break;
            case 2:
                System.out.println("Ingrese Lado A:");
                LadoA = ff.nextFloat();
                System.out.println("Ingrese Lado B:");
                LadoB = ff.nextFloat();
                PerimetroCuadrado = (LadoA * 2) + (LadoB * 2);
                System.out.println("El perimetro del Cuadrado es de:" + PerimetroCuadrado);
                break;
            default:
                System.out.println("Error");

        }

    }

    public void Rectangulo(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Base");
                Base = ff.nextFloat();
                System.out.println("Ingrese Altura");
                Altura = ff.nextFloat();
                AreaRectangulo = Base * Altura;
                System.out.println("El area del rectangulo es de:" + AreaRectangulo);
                break;
            case 2:
                System.out.println("Ingresa Base");
                Base = ff.nextFloat();
                System.out.println("Ingrese Altura");
                Altura = ff.nextFloat();
                PerimetroRectangulo = (Base * 2) + (Altura * 2);
                System.out.println("El perimetro del Rectangulo es de:" + PerimetroRectangulo);
                break;
            default:
                System.out.println("Error");

        }

    }
}
