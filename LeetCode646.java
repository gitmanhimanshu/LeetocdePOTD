import java.util.Arrays;
import java.util.Comparator;

public class LeetCode646 {
   static int dp[][];
  public static void main(String[] args) {
    int a[][]={{1,2},{7,8},{4,5}};
    dp=new int[a.length][a.length];
    for(int b[]:dp){
        Arrays.fill(b,-1);
    }
    //Arrays.sort(a,Comparator.comparingInt(i->i[0]));
    Arrays.sort(a,(b,c)->{
        return b[0]-c[0];
    });
    LeetCode646 obj=new LeetCode646();
    System.out.println(obj.solve(0, -1, a));
  }  
  int solve(int i,int prev,int a[][]){
    if(i>=a.length){
        return 0;
    }
    int t=0;
    if(prev!=-1&&dp[i][prev]!=-1){
    return    dp[i][prev];
    }
    if(prev==-1||a[i][0]>a[prev][1]){
        t=1+solve(i+1, i, a);
    }
    int nt=0+solve(i+1, prev, a);
    if(prev!=-1){
        dp[i][prev]=Math.max(t, nt);
    }
    return Math.max(t, nt);
  }
}
