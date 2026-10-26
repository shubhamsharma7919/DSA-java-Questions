import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        int res = 0;

        for (int num:nums) {
            int lt = num - 1;
            int rt = num + 1;

            while (set.contains(lt)) {
                 set.remove(lt);
                 lt --;
            }

            while (set.contains(rt)) {
                set.remove(rt);
                rt ++;
            }

            res = Math.max(res, rt - lt - 1);
          
        }
          return res;
    }
}