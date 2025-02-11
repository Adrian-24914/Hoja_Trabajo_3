package Hoja_Trabajo_3;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    private int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    private List<Integer> countingSortByDigit(List<Integer> list, int exp) {
        int n = list.size();
        int[] output = new int[n];
        int[] count = new int[10];

        
        for (int num : list) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int num = list.get(i);
            int digit = (num / exp) % 10;
            output[count[digit] - 1] = num;
            count[digit]--;
        }
        
        List<Integer> sortedList = new ArrayList<>();
        for (int num : output) {
            sortedList.add(num);
        }

        return sortedList;
    }

    public List<Integer> RS(List<Integer> list) {
        int max = findMax(list);
        int exp = 1;
        while (max / exp > 0) {
            list = countingSortByDigit(list, exp);
            exp *= 10;
        }
        return list;
    }
}