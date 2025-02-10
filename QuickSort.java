package Hoja_Trabajo_3;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    private int qs = 0;

    public List<Integer> QS(List<Integer> L){
        if (L.size() < 2){
            return L;
        } 
        else{
            int e = L.get(0);
            List<Integer> L1 = new ArrayList<>();
            List<Integer> L2 = new ArrayList<>();

            for (int i = 1; i < L.size(); i++){
                qs++;
                if (L.get(i) < e) {
                    L1.add(L.get(i));
                } else {
                    L2.add(L.get(i));
                }
            }
            List<Integer> sortedList = new ArrayList<>(QS(L1));
            sortedList.add(e);
            sortedList.addAll(QS(L2));
            return sortedList;
        }
    }

    public int getComparisons() {
        return qs;
    }
}