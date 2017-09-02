package calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Inicio {

    public String r;
    public float areaCirculo;
    public float perimetroCirculo;
    public String Base;
    public String Altura;
    public float AreaTriangulo;
    public float PerimetroTriangulo;
    public String Lado;
    public float AreaCuadrado;
    public float PerimetroCuadrado;
    public float AreaRectangulo;
    public float PerimetroRectangulo;
    public String LadoA;
    public String LadoB;

    public Inicio(float AreaCuadrado, float AreaRectangulo, float PerimetroCuadrado,
             float PerimetroRectangulo, String LadoA, String LadoB, String Lado,
             float PerimetroTriangulo, float AreaTriangulo, String Altura, String r,
             float areaCirculo, float perimetroCirculo, String Base) {
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
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa radio");
                r = sc.nextLine();
                System.out.println("numero: ");
                if (ValidarNumero(r) == true) {
                    float aux;
                    aux = Float.valueOf(r);
                    areaCirculo = (float) (3.14 * aux * aux);
                    System.out.println("El area del circulo es:" + areaCirculo);
                    break;
                } else {
                    System.out.println(r + " " + "no es un numero, intentalo denuevo...");
                    break;
                }
            case 2:
                System.out.println("Ingrese Radio");
                r = sc.nextLine();
                if (ValidarNumero(r) == true) {
                    float aux = Float.valueOf(r);
                    d = 2 * aux;
                    perimetroCirculo = (float) ((3.14) * (d));
                    System.out.println("El perimetro del circulo es:" + perimetroCirculo);
                    break;
                } else {
                    System.out.println(r + " no es un numero.");
                    break;
                }

            default:
                System.out.println("Error");

        }

    }

    public void Triangulo(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Base");
                Base = ff.nextLine();
                if (ValidarNumero(Base) == true) {
                    float aux = Float.valueOf(Base);
                    System.out.println("Ingrese Altura");
                    Altura = ff.nextLine();
                    if (ValidarNumero(Altura) == true) {
                        float aux2 = Float.valueOf(Altura);
                        AreaTriangulo = aux * aux2 / 2;
                        System.out.println("El area del triangulo es de:" + AreaTriangulo);
                        break;
                    } else {
                        System.out.println("La altura ingresada debe ser un  numero");
                        break;
                    }
                } else {
                    System.out.println("Base incorrecta, ingrese un numero.");
                    break;
                }
            case 2:
                //triangulo equilatero tiene todos sus lados iguales 
                System.out.println("Ingrese Lado del triangulo Equilátero:");
                Lado = ff.nextLine();
                if (ValidarNumero(Lado) == true) {
                    float aux = Float.valueOf(Lado);
                    PerimetroTriangulo = aux * 3;
                    System.out.println("El perimetro del triangulo es de:" + PerimetroTriangulo);
                    break;
                } else {
                    System.out.println("El valor ingresado es incorrecto.");
                    break;
                }

            default:
                System.out.println("Error");

        }

    }

    public void Cuadrado(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Lado");
                LadoA = ff.nextLine();
                if (ValidarNumero(LadoA) == true) {
                    float aux = Float.valueOf(LadoA);
                    AreaCuadrado = aux * aux;
                    System.out.println("El area del Cuadrado es de:" + AreaCuadrado);
                    break;
                } else {
                    System.out.println("El Lado debe ser un dato numerico");
                    break;
                }

            case 2:
                System.out.println("Ingrese Lado A:");
                LadoA = ff.nextLine();
                if (ValidarNumero(LadoA) == true) {
                    float aux = Float.valueOf(LadoA);
                    PerimetroCuadrado = (aux * 4);
                    System.out.println("El perimetro del Cuadrado es de:" + PerimetroCuadrado);
                    break;
                } else {
                    System.out.println("Lado debe ser un dato numerico");
                    break;
                }

            default:
                System.out.println("Error");

        }

    }

    public void Rectangulo(int n) {
        Scanner ff = new Scanner(System.in);
        switch (n) {
            case 1:
                System.out.println("Ingresa Base");
                Base = ff.nextLine();
                if (ValidarNumero(Base) == true) {
                    System.out.println("Ingrese Altura");
                    Altura = ff.nextLine();
                    if (ValidarNumero(Altura) == true) {
                        float aux1 = Float.valueOf(Base);
                        float aux2 = Float.valueOf(Altura);
                        AreaRectangulo = aux1 * aux2;
                        System.out.println("El area del rectangulo es de:" + AreaRectangulo);
                        break;
                    } else {
                        System.out.println("Altura ingresada debe ser numero");
                        break;
                    }
                } else {
                    System.out.println("Base incorrecta, ingrese un numero.");
                    break;
                }
            case 2:
                System.out.println("Ingresa Base");
                Base = ff.nextLine();
                if (ValidarNumero(Base) == true) {
                    System.out.println("Ingrese Altura");
                    Altura = ff.nextLine();
                    if (ValidarNumero(Altura) == true) {
                        float aux1 = Float.valueOf(Base);
                        float aux2 = Float.valueOf(Altura);
                        PerimetroRectangulo = (aux1 * 2) + (aux2 * 2);
                        System.out.println("El perimetro del Rectangulo es de:" + PerimetroRectangulo);
                        break;
                    } else {
                        System.out.println("Altura igresada debe ser numero");
                        break;
                    }
                } else {
                    System.out.println("Base incorrecta, ingrese un numero.");
                    break;
                }

            default:
                System.out.println("Error");

        }

    }

    public boolean ValidarNumero(String num) {
        int val;
        try {
            val = Integer.parseInt(num);
            return true;
        } catch (Exception e) {

            return false;
        }
    }
}
