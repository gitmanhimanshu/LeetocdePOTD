public class LeetCode877 {

        public boolean stoneGame(int[] piles) {
            int evsum=0;
            int odsum=0;
            for(int i=0;i<piles.length;i+=2){
                evsum+=piles[i];
            }
              for(int i=1;i<piles.length;i+=2){
               odsum+=piles[i];
            }
    return evsum>odsum?true:true;
        }
    public static void main(String[] args) {
        LeetCode877 obj=new LeetCode877();
        System.out.println(obj.stoneGame(new int[]{5,3,4,5}));
    }
}
