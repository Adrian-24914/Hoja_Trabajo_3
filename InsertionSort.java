package Hoja_Trabajo_3;
import java.util.List;

public class InsertionSort implements SortAlgorithm {

    @Override
    public List<Integer> sort(List<Integer> L) {
        return IS(L);
    }
    
    public List<Integer> IS(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;
            
            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, current);
        }
        return list;
    }
}