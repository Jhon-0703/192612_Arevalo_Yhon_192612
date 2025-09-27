import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar  datos
        System.out.print("Ingrese la nota a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese la nota b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese la nota c: ");
        double c = scanner.nextDouble();

        // Validar las  notas
        if (a < 0.0 || a > 10.0 || b < 0.0 || b > 10.0 || c < 0.0 || c > 10.0) {
            System.out.print("Nota invalida");
        } else {
            // Calculamos  promedio
            double promedio = (a + b + c) / 3.0;

            // Mostramos el  promedio
            System.out.print("Promedio: " + promedio);

            //  Condiciones de la clasificación de promedios 
            if (promedio >= 7.0) {
                System.out.println("Estado: Promocionado");
            } else 
            if (promedio >= 4.0) {
                System.out.println("Estado: Regular");
            } else {
                System.out.println("Estado: Reprobado");
            }
        }

        scanner.close();
    }
}



