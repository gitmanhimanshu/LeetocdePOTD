public class LeetCode3142 {
  
        public boolean satisfiesConditions(int[][] grid) {
            
       int lstcl=grid[0].length-1;
       int lstrow=grid.length-1;
            for(int i=0;i<grid.length-1;i++){
                if(grid[i][lstcl]!=grid[i+1][lstcl]){
                    return false;
                }
            }
                for(int i=0;i<grid[0].length-1;i++){
                if(grid[lstrow][i]==grid[lstrow][i+1]){
                    return false;
                }
            }
           
            for(int i=0;i<grid.length-1;i++){
                for(int j=0;j<grid[0].length-1;j++){
                    if(grid[i][j]!=grid[i+1][j]){
                        return false;
                    }
                    if(grid[i][j]==grid[i][j+1]){
                        return false;
                    }
                }
            }
            return true;
        }
    public static void main(String[] args) {
        LeetCode3142  obj=new LeetCode3142();
        System.out.println(obj.satisfiesConditions(new int[][]{{1,0,2},{1,0,2}}));
    }
}
