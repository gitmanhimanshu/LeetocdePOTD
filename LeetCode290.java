import java.util.HashMap;
import java.util.Map;

public class LeetCode290 {
public static void main(String[] args) {
    LeetCode290 obj=new LeetCode290();
    System.out.println(obj.wordPattern("abba", "dog cat cat dog"));
}
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
        if(pattern.length()<a.length||pattern.length()>a.length){
            return false;
        }
        Map<Character,String> him=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(him.containsKey(pattern.charAt(i))){
                if(!him.get(pattern.charAt(i)).equals(a[i])){
                    return false;
                }
            }else{
                if(him.containsValue(a[i])){
                    return false;
                }else{
                    him.put(pattern.charAt(i),a[i]);
                }
            }
        }
        return true;
    }
}

