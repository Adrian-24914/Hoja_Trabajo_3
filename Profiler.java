package Hoja_Trabajo_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Profiler {

    public static void runProfiler() {
        int[] tamanos = {10, 50, 100, 500, 1000, 2000, 3000};  
        Random random = new Random();

        System.out.println("\nEjecutando pruebas de rendimiento...");

        for (int n : tamanos) {
            List<Integer> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lista.add(random.nextInt(10000));
            }

            ejecutarPrueba("Insertion Sort", new InsertionSort(), lista);
            ejecutarPrueba("Merge Sort", new MergeSort(), lista);
            ejecutarPrueba("Quick Sort", new QuickSort(), lista);
            ejecutarPrueba("Radix Sort", new RadixSort(), lista);
            ejecutarPrueba("Heap Sort", new HeapSort(), lista);

            System.out.println("--------------------------------------------------");
        }
    }

    private static void ejecutarPrueba(String nombre, SortAlgorithm algoritmo, List<Integer> lista) {
        List<Integer> copia = new ArrayList<>(lista);
        long startTime = System.nanoTime();
        List<Integer> ordenada = algoritmo.sort(copia);
        long endTime = System.nanoTime();
        System.out.println(nombre + " (" + lista.size() + " elementos): " + (endTime - startTime) + " ns");

        // Prueba con lista ya ordenada
        startTime = System.nanoTime();
        algoritmo.sort(ordenada);
        endTime = System.nanoTime();
        System.out.println(nombre + " (lista ya ordenada) - " + lista.size() + " elementos: " + (endTime - startTime) + " ns");
    }
}

