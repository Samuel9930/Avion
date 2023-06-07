import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Metodos.Avion;

public class Principal {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los aviones
        HashMap<String, Avion> avionMap = new HashMap<>();

        // Menú interactivo
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Menú de Control de Aviones");
            System.out.println("---------------------------");
            System.out.println("1. Agregar un avión");
            System.out.println("2. Despegar un avión");
            System.out.println("3. Aterrizar un avión");
            System.out.println("4. Mostrar información de todos los aviones");
            System.out.println("5. Imprimir cada avión individualmente");
            System.out.println("6. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el código del avión: ");
                    String avionCode = scanner.nextLine();
                    System.out.print("Ingrese el modelo del avión: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese la capacidad de pasajeros del avión: ");
                    int capacidadPasajeros = scanner.nextInt();
                    System.out.print("Ingrese la velocidad máxima del avión: ");
                    double velocidadMaxima = scanner.nextDouble();
                    Avion avion = new Avion(modelo, capacidadPasajeros, velocidadMaxima);
                    avionMap.put(avionCode, avion);
                    System.out.println("Avión agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el código del avión que desea despegar: ");
                    String avionCode1 = scanner.nextLine();
                    Avion avion1 = avionMap.get(avionCode1);
                    if (avion1 != null) {
                        avion1.despegar();
                    } else {
                        System.out.println("No se encontró un avión con el código especificado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del avión que desea aterrizar: ");
                    String avionCode2 = scanner.nextLine();
                    Avion avion2 = avionMap.get(avionCode2);
                    if (avion2 != null) {
                        avion2.aterrizar();
                    } else {
                        System.out.println("No se encontró un avión con el código especificado.");
                    }
                    break;
                case 4:
                    for (Map.Entry<String, Avion> entry : avionMap.entrySet()) {
                        System.out.println("Código del avión: " + entry.getKey());
                        entry.getValue().mostrarInformacion();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el código del avión que desea imprimir: ");
                    String avionCode3 = scanner.nextLine();
                    Avion avion3 = avionMap.get(avionCode3);
                    if (avion3 != null) {
                        System.out.println("Información del avión: ");
                        avion3.mostrarInformacion();
                    } else {
                        System.out.println("No se encontró un avión con el código especificado.");
                    }
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Elección inválida");
                    break;
                    
            }
        }
    }
}