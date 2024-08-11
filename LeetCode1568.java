public class LeetCode1568 {
  
        int numberOfinslands(int mat[][]){
            int ans=0;
            boolean vis[][]=new boolean[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1&&vis[i][j]==false){
                ans++;
                solve(mat,i,j,vis);
            }
        }
        
    }
    return ans;
        }
    
        
    
        void solve(int mat[][],int i,int j,boolean vis[][]){
            if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]==0||vis[i][j]==true){
                return ;
            }
         vis[i][j]=true;
            solve(mat,i+1,j,vis);
            solve(mat,i-1,j,vis);
            solve(mat,i,j+1,vis);
            solve(mat,i,j-1,vis);
          //  mat[i][j]=1;
        }
        public int minDays(int[][] grid) {
            int island=numberOfinslands(grid);
          //  System.out.println(island);
            if(island==0||island>1){
                return 0;
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        grid[i][j]=0;
                        int land=numberOfinslands(grid);
                        if(land==0||land>1){
                            return 1;
                        }
                        grid[i][j]=1;
                    }
                }
            }
            return 2;
        }
    public static void main(String[] args) {
        LeetCode1568  obj=new LeetCode1568();
        int grid[][]= {{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(obj.minDays(grid));
    }
}
