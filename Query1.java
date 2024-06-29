package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Query1 {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 5, 6, 2, 3, 4, 4, 5};
        int[] Rest = removeDuplicates(Arr);
        System.out.println(Arrays.toString(Rest));
    }
    public static int[] removeDuplicates(int[] array) {
        List<Integer> unList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!unList.contains(array[i])) {
                unList.add(array[i]);
            }
        }
        int[] uniqueArray = new int[unList.size()];
        for (int i = 0; i < unList.size(); i++) {
            uniqueArray[i] = unList.get(i);
        }
        return uniqueArray;
    }
}
