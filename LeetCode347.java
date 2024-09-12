import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode347 {
    class pair implements Comparable<pair>{
    int i;
    int count;
       pair(int i,int c){
        this.i=i;
        this.count=c;
       }
       public int compareTo(pair th){
        return th.count-this.count;
       }
}

    public int[] topKFrequent(int[] nums, int k) {
      int ans[]=new int[k];  
      Map<Integer,Integer> him=new HashMap<>();
      for(int i: nums){
        him.put(i,him.getOrDefault(i,0)+1);
      }
     // System.out.println(him);
      PriorityQueue<pair> him1=new PriorityQueue<>();
      for(Integer i:him.keySet()){
        him1.add(new pair(i,him.get(i)));
      }
      int i=0;
      while(i<k&&(!him1.isEmpty())){
        pair p=him1.poll();
     //   System.out.println(p.i);
       
        ans[i++]=p.i;

      }
      return ans;
    }
    public static void main(String[] args) {
        LeetCode347 obj=new LeetCode347();
        System.out.println(Arrays.toString(obj.topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
    }
}

