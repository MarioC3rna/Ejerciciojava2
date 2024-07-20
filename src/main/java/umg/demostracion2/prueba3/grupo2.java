package umg.demostracion2.prueba3;

import java.util.Scanner;

public class grupo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el lado de la base de la pirámide: ");
        double ladoBase = scanner.nextDouble();

        System.out.print("Introduce la altura lateral de la pirámide: ");
        double alturaLateral = scanner.nextDouble();

        // Calcula el área de la base
        double areaBase = Math.pow(ladoBase, 2);

        // Calcula el área lateral
        double areaLateral = 2 * ladoBase * alturaLateral;

        // Calcula el área total
        double areaTotal = areaBase + areaLateral;

        System.out.println("El área total de la pirámide cuadrada es: " + areaTotal);
    }
}