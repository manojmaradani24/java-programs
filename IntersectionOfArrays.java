import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = sol.intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean alreadyPresent = false;
                    for (int k = 0; k < list.size(); k++) {
                        if (list.get(k) == nums1[i]) {
                            alreadyPresent = true;
                            break;
                        }
                    }
                    if (!alreadyPresent) {
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}