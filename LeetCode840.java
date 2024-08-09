class LeetCode840{

        boolean isValid(int r,int c,int grid[][]){
            int a[]=new int[10];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(grid[i+r][j+c]<1||grid[i+r][j+c]>9){
                        return false;
                    }
                    a[grid[i+r][j+c]]++;
                }
            }
            for(int i=1;i<=9;i++){
                if(a[i]!=1){
                    return false;
                }
            }
                int sum = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
          for (int i = 0; i < 3; i++) {
                if (grid[r + i][c] + grid[r + i][c + 1] + grid[r + i][c + 2] != sum) return false;
                if (grid[r][c + i] + grid[r + 1][c + i] + grid[r + 2][c + i] != sum) return false;
            }
            if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != sum) return false;
            if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c] != sum) return false;
            return true;
        }
        public int numMagicSquaresInside(int[][] grid) {
            int ans=0;
            for(int i=0;i<grid.length-2;i++){
                for(int j=0;j<grid[0].length-2;j++){
                    if(isValid(i,j,grid)){
                        ans++;
                    }
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            LeetCode840 obj=new LeetCode840();
            int a[][]={{4,3,8,4},{9,5,1,9},{2,7,6,2}};
            System.out.println(obj.numMagicSquaresInside(a));
        }
    }
