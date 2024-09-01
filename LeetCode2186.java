import java.util.HashMap;
import java.util.Map;

public class LeetCode2186 {

        public int minSteps(String s, String t) {
            Map<Character, Integer> him = new HashMap<>();
            for (Character i : s.toCharArray()) {
                him.put(i, him.getOrDefault(i, 0) + 1);
            }
            int ans = 0;
            for (Character i : t.toCharArray()) {
                if (him.containsKey(i)) {
                    him.put(i, him.getOrDefault(i, 0) - 1);
                    if (him.get(i) == 0) {
                        him.remove(i);
                    }
                } else {
                    ans++;
                }
            }
            for(Integer i:him.values()){
                ans+=i;
            }
            return ans;
        }
        public static void main(String[] args) {
            LeetCode2186 obj=new LeetCode2186();
            System.out.println(obj.minSteps("leetcode", "coats"));
        }
    }

