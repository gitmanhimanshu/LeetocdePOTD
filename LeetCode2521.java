
import java.util.HashSet;
import java.util.Set;

class LeetCode2521{
  
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> him=new HashSet<>();
        for(int i=2;i<=1000;i++){
            if(isPrime(i)){
                him.add(i);
            }
        }
        Set<Integer> him2=new HashSet<>();
        for(int i:nums){
            for(Integer j:him){
                if(i%j==0){
                    him2.add(j);
                }
            }
        }
        return him2.size();
    }
     public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LeetCode2521 obj=new LeetCode2521();
        System.out.println(obj.distinctPrimeFactors(new int[]{2,4,3,7,10,6}));
    }
}