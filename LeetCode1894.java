public class LeetCode1894 {
    public static void main(String[] args) {
        LeetCode1894 obj=new LeetCode1894();
        System.out.println(obj.chalkReplacer(new int[]{5,1,5}, 22));
    }
  
        public int chalkReplacer(int[] chalk, int k) {
           long s=0;
    
            for(int i=0;i<chalk.length;i++){
                s+=chalk[i];
            }
            while(k>=s){
             k=k-(int)s;
            }
            for(int i=0;i<chalk.length;i++){
                k=k-chalk[i];
                if(k<0){
                    return i;
                }
            }
            return -1;
        }
    }

