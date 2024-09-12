import java.util.HashSet;
import java.util.Set;

public class LeetCode1684 {
    public static void main(String[] args) {
        LeetCode1684 obj=new LeetCode1684();
        System.out.println(obj.countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"}));
    }
 
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character > him=new HashSet<>();
        for(Character i:allowed.toCharArray()){
            him.add(i);
        }
        int ans=0;
        for(String s:words){
            boolean haha=false;
             for(int i=0;i<s.length();i++){
                     if(!him.contains(s.charAt(i))){
                        haha=true;
                     }
             }
             if(!haha){
                ans++;
             }
        }
        return ans;
    }
}

