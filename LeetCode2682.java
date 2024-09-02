import java.util.*;

public class LeetCode2682 {
   public static void main(String[] args) {
    LeetCode2682 obj=new LeetCode2682();
    System.out.println(Arrays.toString(obj.circularGameLosers(5, 2)));
   } 

    public int[] circularGameLosers(int n, int k) {
        Set<Integer> him = new HashSet<>();
      
        int j = 1;
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        int i=0;
        while (true) {
            if (him.contains(a[i])) {
                break;
            }
            him.add(a[i]);
            i = (i + (k * j)) % (n);
            
            
            j++;
            
        }
      

        int ans[] = new int[n - him.size()];
        i = 0;
        j=0;
        while (j<a.length) {
            if(!him.contains(a[j]))
           { ans[i++] = a[j];}
           j++;
        }
        return ans;
    }
}

