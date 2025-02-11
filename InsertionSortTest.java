package Hoja_Trabajo_3;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

public class InsertionSortTest {
    private SortAlgorithm insertionSort;

    @Test
    public void testSort_OrdenAleatorio() {
        insertionSort = new InsertionSort();
        List<Integer> entrada = Arrays.asList(4, 10, 3, 5, 1);
        List<Integer> esperado = Arrays.asList(1, 3, 4, 5, 10);
        Assert.assertEquals(esperado, insertionSort.sort(entrada));
    }
    
    @Test
    public void testSort_ListaOrdenada() {
        insertionSort = new InsertionSort();
        List<Integer> entrada = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> esperado = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertEquals(esperado, insertionSort.sort(entrada));
    }
}
