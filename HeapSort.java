package Hoja_Trabajo_3;
import java.util.List;

public class HeapSort {
    public List<Integer> sort(List<Integer> lista) {
        int n = lista.size();

        // Construir el heap (reorganizar la lista)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(lista, n, i);
        }

        // Extraer elementos uno por uno del heap
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final
            int temp = lista.get(0);
            lista.set(0, lista.get(i));
            lista.set(i, temp);

            // Llamar heapify en el heap reducido
            heapify(lista, i, 0);
        }
        return lista;
    }

    private void heapify(List<Integer> lista, int n, int i) {
        int mayor = i;
        int izquierda = 2 * i + 1;
        int derecha = 2 * i + 2;

        if (izquierda < n && lista.get(izquierda) > lista.get(mayor)) {
            mayor = izquierda;
        }

        if (derecha < n && lista.get(derecha) > lista.get(mayor)) {
            mayor = derecha;
        }

        if (mayor != i) {
            int swap = lista.get(i);
            lista.set(i, lista.get(mayor));
            lista.set(mayor, swap);

            heapify(lista, n, mayor);
        }
    }
}

