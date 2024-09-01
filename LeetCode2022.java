import java.util.Arrays;

public class LeetCode2022 {

        public int[][] construct2DArray(int[] original, int m, int n) {
            int ans[][]=new int[m][n];
            if(m*n!=original.length){
                return new int[0][0];
            }
            for(int i=0;i<original.length;i++){
                ans[i/n][i%n]=original[i];
            }
            return ans;
        }
    public static void main(String[] args) {
        LeetCode2022 obj=new LeetCode2022();
       int ans[][]=obj.construct2DArray(new int[]{1,2,3,4}, 2, 2);
       for(int b[]:ans){
        System.out.println(Arrays.toString(b));
       }
    }
}
