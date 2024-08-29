public class LeetCode947 {
 
        public int removeStones(int[][] stones) {
           int vis[]=new int[stones.length]; 
        int g=0;
        for(int i=0;i<stones.length;i++){
            if(vis[i]==0){
                dfs(i,stones,vis);
                g++;
            }
        }
    return stones.length-g;
        }
        void dfs(int ind,int stones[][],int vis[]){
            vis[ind]=1;
            for(int i=0;i<stones.length;i++){
                if(vis[i]==0&&(stones[ind][0]==stones[i][0]||stones[ind][1]==stones[i][1])){
                    dfs(i,stones,vis);
                }
            }
        }
    
        public static void main(String[] args) {
            LeetCode947 obj=new LeetCode947();
            int stones[][]={{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
            System.out.println(obj.removeStones(stones));
        }
    }  

