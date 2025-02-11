package Hoja_Trabajo_3;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class InsertionSortTest {
    private SortAlgorithm insertionSort;
    //test unitario para asegurar que el método ordene de forma correcta los datos que se ingresan
    @Test
    public void testSort_OrdenAleatorio() {
        insertionSort = new InsertionSort();
        List<Integer> entrada = Arrays.asList(4, 10, 3, 5, 1);
        List<Integer> esperado = Arrays.asList(1, 3, 4, 5, 10);
        Assert.assertEquals(esperado, insertionSort.sort(entrada));
    }
    //Si los elementos ya están ordenados, debería no haber ningún cambio y permanecer igual    
    @Test
    public void testSort_ListaOrdenada() {
        insertionSort = new InsertionSort();
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals(esperado, insertionSort.sort(entrada));
    }
}
