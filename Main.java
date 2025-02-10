package Hoja_Trabajo_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar una lista aleatoria de 2000 números
        List<Integer> originalNumbers = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            originalNumbers.add(random.nextInt(10000)); // Números aleatorios entre 0 y 9999
        }

        // Bandera para controlar el bucle del menú
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            System.out.println("\nSeleccione el tipo de ordenamiento:");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Heap Sort");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 6) {
                continuar = false; // Cambiar la bandera para salir del bucle
                System.out.println("Saliendo del programa...");
                break;
            }

            // Crear una copia de la lista original para cada algoritmo
            List<Integer> numbers = new ArrayList<>(originalNumbers);

            long startTime, endTime;

            switch (opcion) {
                case 1: // Insertion Sort
                    InsertionSort insertionSort = new InsertionSort();
                    startTime = System.nanoTime();
                    numbers = insertionSort.sort(numbers);
                    endTime = System.nanoTime();
                    System.out.println("Insertion Sort completado. Tiempo: " + (endTime - startTime) + " nanosegundos");
                    break;

                case 2: // Merge Sort
                    MergeSort mergeSort = new MergeSort();
                    startTime = System.nanoTime();
                    numbers = mergeSort.sort(numbers);
                    endTime = System.nanoTime();
                    System.out.println("Merge Sort completado. Tiempo: " + (endTime - startTime) + " nanosegundos");
                    break;

                case 3: // Quick Sort
                    QuickSort quickSort = new QuickSort();
                    startTime = System.nanoTime();
                    numbers = quickSort.sort(numbers);
                    endTime = System.nanoTime();
                    System.out.println("Quick Sort completado. Tiempo: " + (endTime - startTime) + " nanosegundos");
                    break;

                case 4: // Radix Sort
                    RadixSort radixSort = new RadixSort();
                    startTime = System.nanoTime();
                    numbers = radixSort.sort(numbers);
                    endTime = System.nanoTime();
                    System.out.println("Radix Sort completado. Tiempo: " + (endTime - startTime) + " nanosegundos");
                    break;

                case 5: // Heap Sort
                    HeapSort heapSort = new HeapSort();
                    startTime = System.nanoTime();
                    numbers = heapSort.sort(numbers);
                    endTime = System.nanoTime();
                    System.out.println("Heap Sort completado. Tiempo: " + (endTime - startTime) + " nanosegundos");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}