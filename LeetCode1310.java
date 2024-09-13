import java.util.Arrays;

public class LeetCode1310 {
  
        public int[] xorQueries(int[] arr, int[][] queries) {
            int ans[]=new int[queries.length];
            int k=0;
            for(int a[]:queries){
                int st=a[0];
                int e=a[1];
                int xor=0;
                for(int i=st;i<=e;i++){
                    xor^=arr[i];
                }
              
                ans[k++]=xor;
            
            }
            
            return ans;
        }
        public static void main(String[] args) {
            LeetCode1310 obj=new LeetCode1310();
            System.out.println(Arrays.toString(obj.xorQueries(new int[]{1,3,4,8}, new int[][]{{0,1},{1,2},{0,3},{3,3}})));
        }
    }

