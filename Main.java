import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salida=1;
        do {
            //INGRESAR NUMEROS
            System.out.println("Ingrese los numeros que desea operar:");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            //ELEGIR OPERACION
            System.out.println("Ingrese la operacion que desea realizar(1,2,3 o 4):");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("3.MULTIPLICACION");
            System.out.println("4.DIVISION");
            int operacion = sc.nextInt();
            //OPERACIONES
            if (operacion == 1) {
                double suma = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + suma);
            } else if (operacion == 2) {
                double resta = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + resta);
            } else if (operacion == 3) {
                double multiplicacion = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + multiplicacion);
            } else if (operacion == 4) {
                if (n2 == 0) {
                    System.out.println("No es posible dividir por 0");
                } else {
                    double division = n1 / n2;
                    System.out.println(n1 + "/" + n2 + "=" + division);
                }
            } else {
                System.out.println("La opcion ingresada no es correcta");
            }
            //INGRESAR NUEVAMENTE O SALIR DE LA CALCULADORA
            System.out.println("DESEA REALIZAR OTRA OPERACION? SI:Ingresar 1/ NO:Ingresar 0");
            salida=sc.nextInt();
        }while(salida==1);
        System.out.println("BYE");
    }
}