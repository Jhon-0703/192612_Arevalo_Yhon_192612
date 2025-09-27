import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ingresar  los datos 
        System.out.print("Ingrese el primer numero : ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero : ");
        double num2 = scanner.nextDouble();

        // Condiciones suma y diferencia
        if (num1 >= num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
            // si el numero dos es igual a cero no se puede dividir
        }
        if (num2 == 0) {
             System.out.println("No se puede dividir entre cero");
         } else {
            double producto = num1 * num2;
            double division =  num1 / num2;
             System.out.println("Producto: " + producto);
            System.out.println("Division: " + division);
            
        }

    }
}
