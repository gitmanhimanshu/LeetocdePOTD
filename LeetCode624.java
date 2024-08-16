import java.util.*;

public class LeetCode624 {
 
        public int maxDistance(List<List<Integer>> arrays) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            List<Integer> h=arrays.get(0);
            for(Integer i: h){
                if(min>i){
                    min=i;
                }
                if(max<i){
                    max=i;
                }
            }
            int ans=0;
        for(int i=1;i<arrays.size();i++){
            int max2=Integer.MIN_VALUE;
            int min2=Integer.MAX_VALUE;
            for(Integer j: arrays.get(i)){
                if(max2<j){
                    max2=j;
                }
                if(min2>j){
                    min2=j;
                }
            }
            ans=Math.max(ans,Math.max(Math.abs(max2-min),Math.abs(max-min2)));
            min=Math.min(min2,min);
            max=Math.max(max2,max);
        }
        return ans;
        }
        public static void main(String[] args) {
            LeetCode624 obj=new LeetCode624();
            List<List<Integer>> him=new ArrayList<>();
            him.add(new ArrayList<>(Arrays.asList(1,2,3)));
            him.add(new ArrayList<>(Arrays.asList(4,5)));
            him.add(new ArrayList<>(Arrays.asList(1,2,3)));
            System.out.println(obj.maxDistance(him));
        }
    }  

