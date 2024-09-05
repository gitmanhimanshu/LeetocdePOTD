import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2028 {
   
        boolean milgya;
        public int[] missingRolls(int[] rolls, int mean, int n) {
            List<Integer> him=new ArrayList<>();
            milgya=false;
            int sum=0;
            for(int i=0;i<rolls.length;i++){
                sum+=rolls[i];
            }
    int total=mean*(rolls.length+n);
    
            solve(n,rolls.length+n,total-sum,him);
          //  System.out.println(him);
            int ans[]=new int [him.size()];
            int i=0;
              
            for(Integer j:him){
                ans[i++]=j;
            }
            return ans;
        }
        void solve(int n,int total,int sum,List<Integer> him){
            if(n==0&&sum==0){
               milgya=true;
               return;
            }
            if(n==0||sum<=0||sum<n||sum>6*n){
                return;
            }
            for(int i=1;i<=6;i++){
                him.add(i);
                solve(n-1,total,sum-i,him);
                if(milgya){
                    return ;
                }
                him.remove(him.size()-1);
                
            }
        }
        public static void main(String[] args) {
            LeetCode2028 obj=new LeetCode2028();
            System.out.println(Arrays.toString(obj.missingRolls(new int[]{3,2,4,3}, 4, 2)));
        }
    }

