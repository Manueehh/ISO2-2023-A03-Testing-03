package es.uclm.esi.iso2.ga03.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
	public static String leerStringDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String entradaUsuario = scanner.nextLine();

        scanner.close();
        return entradaUsuario;
    }
	
	public static double leerDoubleDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);

        double entradaUsuario = 0.0;

        try {
            System.out.print("Ingresa un número double: ");
            entradaUsuario = scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.next();
            throw e;
        } finally {
            scanner.close();
        }

        return entradaUsuario;
    }
}
