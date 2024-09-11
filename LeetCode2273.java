import java.util.ArrayList;
import java.util.List;

public class LeetCode2273 {
    public static void main(String[] args) {
        LeetCode2273 obj=new LeetCode2273();
        System.out.println(obj.removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
    }
  
    public List<String> removeAnagrams(String[] words) {
        List<String>him=new ArrayList<>();
        //Set<String> s=new HashSet<>();
        // for(String i:words){
        //     if(!s.contains(find(i))||i.length()<2){
        //                     him.add(i);
        //                     s.add(find(i));
        //     }
        // }
        him.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!find(words[i]).equals(find(words[i-1]))){
                him.add(words[i]);
            }
        }
       return him;
    }
String find(String s){
    int a[]=new int[26];
    for(Character i:s.toCharArray()){
        a[i-'a']++;
    }
    StringBuilder ans=new StringBuilder();
    for(int i:a){
        ans.append(i);
    }
    return ans.toString();
}
}

