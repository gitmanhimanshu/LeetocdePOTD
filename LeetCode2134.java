class LeetCode2134 {
    public static int minSwaps(int[] nums) {
        int one=0;
        for(int i:nums){
            if(i==1){
                one++;
            }
        }
        int a[]=new int [nums.length*2];
        for(int i=0;i<a.length;i++){
            a[i]=nums[i%nums.length];
        }
        int ans=Integer.MAX_VALUE;
        int c=0;
     int i=0,j=0;
     while(j<a.length){
        if(a[j]==1){
            c++;
        }
        if(j-i+1>=one){
            ans=Math.min(ans,one-c);
            if(a[i]==1){
                c--;
            }
            i++;
        }
        j++;
     }
     return ans;
    }
    public static void main(String []args){
        int nums[]={0,1,1,0,1,1,0};
        System.out.println(minSwaps(nums));
    }
}