class LeetCode1905{
    public static void main(String[] args) {
     int [][]   grid1 = {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}}; int [][] grid2 = {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
     LeetCode1905 obj=new LeetCode1905();
     System.out.println(obj.countSubIslands(grid1,grid2));
    }
        public int countSubIslands(int[][] grid1, int[][] grid2) {
            int ans=0;
            for(int i=0;i<grid1.length;i++){
                for(int j=0;j<grid1[0].length;j++){
                    if(grid1[i][j]==1&&grid2[i][j]==1){
                    
                    //    System.out.println(i+" "+j);
                       if(solve(grid1,grid2,i,j)){
                         ans++;
                       }
                    }
                }
            }
            return ans;
        }
        boolean solve(int a[][],int b[][],int i,int j){
            if(i<0||j<0||j>=a[0].length||i>=a.length||b[i][j]==0){
                return true;
            }
            if(a[i][j]==0){
                return false;
            }
            b[i][j]=0;
            a[i][j]=0;
        boolean up=    solve(a,b,i-1,j);
       boolean d=     solve(a,b,i+1,j);
        boolean r=    solve(a,b,i,j+1);
         boolean l=   solve(a,b,i,j-1);
         return up&&d&&r&&l;
        }
    }
