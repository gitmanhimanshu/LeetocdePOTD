import java.util.*;
class pair implements Comparable<pair>{
    int v;
    double wt;
    pair(int v,double wt){
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(pair that){
        return Double.compare(this.wt, that.wt);
    }


}
class p{
    int n;
   double wt;
    p(int v,double wt){
        this.n=v;
        this.wt=wt;
    }
    public String toString(){
        return this.n+" "+this.wt;    }
}
class LeetCode1514 {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
       double ans[]=new double[n];
       for(int i=0;i<succProb.length;i++){
        succProb[i]=-1*(succProb[i]);
       } 
     //  System.out.println(Arrays.toString(succProb));
       ArrayList<ArrayList<p>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       
       for(int i = 0; i < edges.length; i++){
        // System.out.println(Arrays.toString(edges[i]));
      
        adj.get(edges[i][0]).add(new p(edges[i][1], succProb[i]));
        adj.get(edges[i][1]).add(new p(edges[i][0], succProb[i]));
       // System.out.println(adj.get(edges[i][0]));
    }
    // System.out.println(adj.get(0));
    // System.out.println(adj.get(1));
    // System.out.println(adj.get(2));
    //    for(int i=0;i<adj.size();i++){
    //     System.out.print(adj.get(i));
    //    }
       int vis[]=new int[n];
     //  System.out.println(Arrays.toString(vis));
Arrays.fill(ans,Double.MAX_VALUE/2);
       PriorityQueue<pair> him=new PriorityQueue<>();
       him.add(new pair(start_node,-1));
       while(!him.isEmpty()){
         pair h=him.poll();
         int e=h.v;
    //     System.out.println(him.isEmpty());
       //  System.out.println(vis[e]);
         if(vis[e]==1){
            continue;
         }
         vis[e]=1;
         ans[e]=h.wt;
       
       //  System.out.print(ans[e]+" ");
      // System.out.println(Arrays.toString(ans));
         ArrayList<p> neib=adj.get(e);
         for(p k: neib){
            int u=k.n;
            double wt=k.wt;
            
          //  System.out.println(u+" "+(vis[u]==0));
            if((h.wt*wt*(-1))<ans[u]){
                
                ans[u]=h.wt*wt*(-1);
                
                him.add(new pair(u,ans[u]));
            }
         }
         

       }
     //  System.out.println(Arrays.toString(ans));
     if(ans[end_node]==Double.MAX_VALUE/2){
      return 0.0;

     }
       return (-1)*ans[end_node];

    
}
    public static void main(String[] args) {
        int n=3;
        int edges[][]= {{0,1},{1,2},{0,2}};
    double su[]={ 0.5,0.5,0.2};
    int start = 0, end = 2;
    LeetCode1514 obj=new LeetCode1514();
    System.out.println(obj.maxProbability(n, edges, su, start, end));
    }
}