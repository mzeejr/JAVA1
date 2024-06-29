package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Query2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] wadaag = findCommonElements(arr1, arr2);
        System.out.println(Arrays.toString(wadaag));
    }
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> A1 = new HashSet<>();
        for (int num : arr1) {
            A1.add(num);
        }
        Set<Integer> A2 = new HashSet<>();
        for (int num : arr2) {
            if (A1.contains(num)) {
                A2.add(num);
            }
        }
        int[] Rest = new int[A2.size()];
        int i = 0;
        for (int num : A2) {
            Rest[i++] = num;
        }
        return Rest;
}
}