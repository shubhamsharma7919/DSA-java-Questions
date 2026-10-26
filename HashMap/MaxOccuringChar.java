import java.util.HashMap;
class MaxOccuringChar {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0;i<s.length();i++) {
           char ch = s.charAt(i);
           
           if (map.containsKey(ch) == false) {
              map.put(ch, 1);
           } else {
               int oldfreq = map.get(ch);
               map.put(ch, oldfreq + 1);
           }
        }
        
        char ans = '\0';
        int maxfreq = 0;
        
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            
            if (map.get(ch) > maxfreq) {
                ans = ch;
                maxfreq = map.get(ch);
            } else if (map.get(ch) == maxfreq && ans > ch) {
                ans = ch;
            }
        }
        return ans;
    }
}