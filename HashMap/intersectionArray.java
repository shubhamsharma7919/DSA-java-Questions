import java.util.ArrayList;
import java.util.HashMap;

class intersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

         ArrayList<Integer> arr = new ArrayList<>();
         for (int i=0;i<nums1.length;i++) {
                map.put(nums1[i], 1);
        }
        for (int j=0;j<nums2.length;j++) {
            if (map.containsKey(nums2[j])) {
                arr.add(nums2[j]);
                map.remove(nums2[j]); 
            }
        }
        // return arr.stream().mapToInt(Integer::intValue).toArray(); OR

        int[] res = new int[arr.size()];
        for (int i=0;i<res.length;i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}