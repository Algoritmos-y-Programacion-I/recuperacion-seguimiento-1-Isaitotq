import java.util.Scanner;

public class Recuperacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("ejercicio 1: Ingrese tres numeros enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int iguales = contarIguales(num1, num2, num3);
        System.out.println("cantidad de parámetros iguales: " + iguales);

        // Ejercicio 2
        System.out.println("ejercicio 2: Ingrese un nombre y un numero (1 o 0): ");
        String nombre = scanner.next();
        int opcion = scanner.nextInt();
        String saludo = generarSaludo(nombre, opcion);
        System.out.println(saludo);

        // Ejercicio 3
        System.out.println("ejercicio 3: Ingrese tres palabras: ");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();
        int longitudAdecuada = contarLongitudAdecuada(palabra1, palabra2, palabra3);
        System.out.println("cantidad de palabras con longitud 4 o mas: " + longitudAdecuada);

        // Ejercicio 4
        System.out.println("ejercicio 4: Ingrese dos palabras:");
        String str1 = scanner.next();
        String str2 = scanner.next();
        boolean sonIguales = compararPosicion(str1, str2);
        System.out.println("los caracteres en la posición 2 son iguales: " + sonIguales);

        // Ejercicio 5
        System.out.println("ejercicio 5: Ingrese los coeficientes a, b y c de la ecuacion cuadratica:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calcularRaices(a, b, c);

        scanner.close();
    }

    // Ejercicio 1
    public static int contarIguales(int a, int b, int c) {
        int count = 0;
        if (a == b) count++;
        if (b == c) count++;
        if (a == c) count++;
        return count;
    }

    // Ejercicio 2
    public static String generarSaludo(String nombre, int opcion) {
        if (opcion == 1) {
            return "Quiubo " + nombre;
        } else if (opcion == 0) {
            return "bye " + nombre;
        } else {
            return "Error entradas inválidas";
        }
    }

    // Ejercicio 3
    public static int contarLongitudAdecuada(String a, String b, String c) {
        int count = 0;
        if (a.length() >= 4) count++;
        if (b.length() >= 4) count++;
        if (c.length() >= 4) count++;
        return count;
    }

    // Ejercicio 4
    public static boolean compararPosicion(String a, String b) {
        if (a.length() < 3 || b.length() < 3) {
            System.out.println("Error: Ambas cadenas deben tener al menos 3 caracteres.");
            return false;
        }
        return a.charAt(2) == b.charAt(2);
    }

    // Ejercicio 5
    public static void calcularRaices(double a, double b, double c) {
        if (a == 0) {
            System.out.println("el coeficiente 'a' no puede ser cero en una ecuacion cuadratica.");
            return;
        }
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("las raices son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("la raiz doble es: " + raiz);
        } else {
            System.out.println("no contiene raices reales :p. ");
        }
    }
}
