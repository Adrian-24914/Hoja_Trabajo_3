package Hoja_Trabajo_3;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class HeapSortTest {
    private SortAlgorithm heapSort;
    //test unitario para asegurar que el método ordene de forma correcta los datos que se ingresan
    @Test
    public void testSort_OrdenAleatorio() {
        heapSort = new HeapSort();
        List<Integer> entrada = Arrays.asList(4, 10, 3, 5, 1);
        List<Integer> esperado = Arrays.asList(1, 3, 4, 5, 10);
        Assert.assertEquals(esperado, heapSort.sort(entrada));
    }
    //Si los elementos ya están ordenados, debería no haber ningún cambio y permanecer igual
    @Test
    public void testSort_ListaOrdenada() {
        heapSort = new HeapSort();
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals(esperado, heapSort.sort(entrada));
    }
}
