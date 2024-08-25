import java.util.Arrays;

public class LeetCode1048 {
static int dp[][];
    public static void main(String[] args) {
        String a[]={"xbc","pcxbcf","xb","cxbc","pcxbc"};
     //   System.out.println(Arrays.toString(a));
     dp=new int[a.length][a.length];
     for(int b[]:dp){
        Arrays.fill(b, -1);
     }
        Arrays.sort(a,(b,c)->{
          return  b.length()-c.length();
        });
    LeetCode1048 obj=new LeetCode1048();
    System.out.println(obj.solve(0, -1, a));
    }
    boolean ispred(String a,String b){
        if(a.length()>b.length()||(a.length()+1)!=b.length())
        {
            return false;
        }
        int i=0,j=0;
        while (i<a.length()&&j<b.length()) {
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;
        }
        return i==a.length();
    }
    int solve(int i,int prev,String a[]){
        if(i>=a.length){
            return 0;
        }int t=0;
        if(prev!=-1&&dp[i][prev]!=-1){
            return dp[i][prev];
        }
        if(prev==-1||ispred(a[prev],a[i])){
            t=1+solve(i+1, i, a);
        }
        int nt=solve(i+1, prev, a);
        if(prev!=-1){
            dp[i][prev]=Math.max(t, nt);
        }
        return Math.max(t, nt);
    }
}
