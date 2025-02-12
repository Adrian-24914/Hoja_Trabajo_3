package Hoja_Trabajo_3;
import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortAlgorithm{

    @Override
    public List<Integer> sort(List<Integer> L) {
        return MS(L);
    }

    public List<Integer> MS(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        left = MS(left);
        right = MS(right);
        return merge(left, right);
    }
    
    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}