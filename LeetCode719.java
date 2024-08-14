import java.util.Arrays;

public class LeetCode719 {
  
        int find(int a[],int diff){
            int i=0;
    int ans=0;
            for(int j=1;j<a.length;j++ ){
                while(Math.abs(a[j]-a[i])>diff){
                    i++;
                }
             if(Math.abs(a[j]-a[i])<=diff){
                ans+=j-i;
             }
            }
            return ans;
        }
        public int smallestDistancePair(int[] nums, int k) {
            Arrays.sort(nums);
            int low=Integer.MAX_VALUE;
            for(int i=1;i<nums.length;i++){
                if(Math.abs(nums[i]-nums[i-1])<low){
                    low=Math.abs(nums[i]-nums[i-1]);
                }
            }
            int high=nums[nums.length-1]-nums[0];
            while(low<high){
                int mid=(low+high)/2;
                int findpair=find(nums,mid);
             
                if(findpair<k){
                    low=mid+1;
                }else{
                    high=mid;
                }
            }
            return low;
        }
    public static void main(String[] args) {
        LeetCode719  obj=new LeetCode719();
        System.out.println(obj.smallestDistancePair(new int[]{4,5,6,2,4,6,6,4,6}, 2));
    }

}
