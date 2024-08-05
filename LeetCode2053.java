import java.util.*;

class LeetCode2053 {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> him=new HashMap<>();
        for(String s:arr){
            him.put(s,him.getOrDefault(s,0)+1);

        }
        int j=1;
        for(String s:arr){
            if(him.get(s)==1){
                if(j==k){
                    return s;
                }else{
                    j++;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        LeetCode2053 obj=new LeetCode2053();
        System.out.println(obj.kthDistinct(new String[]{"a","b","a","ab","a"}, 2));
    }
}
