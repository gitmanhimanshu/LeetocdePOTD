import java.util.Arrays;

public class LeetCode566 {
   public static void main(String[] args) {
    LeetCode566 obj=new LeetCode566();
    int ans[][]=obj.matrixReshape(new int [][]{{1,2},{3,4}}, 1, 4);
    for(int b[]:ans){
        System.out.println(Arrays.toString(b));
    }
   }
        public int[][] matrixReshape(int[][] mat, int r, int c) {
      if(r*c!=mat.length*mat[0].length){
        return mat;
      }
            int t=mat.length*mat[0].length;
           int ans[][]=new int [r][c];
           for(int i=0;i<t;i++){
            ans[i/c][i%c]=mat[i/mat[0].length][i%mat[0].length];
           } 
           return ans;
        }
    }

