import java.util.*;

class LeetCode1508 {
    int mod=1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> him=new ArrayList<>();
        int i=0;
        int j=0;
        int sum=0;
        while(j<nums.length){
                sum+=nums[j];
                him.add(sum%mod);
                i=0;
                int sum2=0;
                while(i<j){
                        sum2+=nums[i];
                        him.add((sum-sum2)%mod);
                        i++;
                }
                j++;
        }
        Collections.sort(him);
        int ans=0;
        for(i=left-1;i<right;i++){
            ans+=him.get(i);
            ans=ans%mod;
        }
        return ans%mod;
    }
    public static void main(String[] args) {
        LeetCode1508 obj=new LeetCode1508();
        System.out.println(obj.rangeSum(new int[]{1,2,3,4},4,1,3));
    }
}
