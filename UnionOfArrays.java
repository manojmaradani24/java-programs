import java.util.*;
public class UnionOfArrays {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};
        int[] result = sol.union(nums1, nums2);
        System.out.print("Union: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
class Solution {
    public int[] union(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == nums1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            boolean found = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == nums2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}