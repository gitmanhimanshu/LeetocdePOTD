import java.util.Stack;

public class LeetCode907 {
    
        int []prev(int []a){
            Stack<Integer> him=new Stack<>();
            int ans[]=new int[a.length];
            for(int i=0;i<a.length;i++){
                while(!him.isEmpty()&&a[him.peek()]>=a[i]){
                    him.pop();
                }
                if(him.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=him.peek();
                }
                him.add(i);
            }
    
            return ans;
        }
         int []next(int []a){
            Stack<Integer> him=new Stack<>();
            int ans[]=new int[a.length];
            for(int i=a.length-1;i>=0;i--){
                while(!him.isEmpty()&&a[him.peek()]>a[i]){
                    him.pop();
                }
                if(him.isEmpty()){
                    ans[i]=a.length;
                }else{
                    ans[i]=him.peek();
                }
                him.add(i);
            }
            return ans;
                }
        public int sumSubarrayMins(int[] arr) {
        //  int sum=0;
          int mod=1000000007;
        //  for(int i=0;i<arr.length;i++){
        //     int min=arr[i];
        //     for(int j=i;j<arr.length;j++){
        //         min=arr[j]<min?arr[j]:min;
        //         sum=(sum+min)%mod;
        //     }
        //  }   
        int p[]=prev(arr);
        int n[]=next(arr);
    long sum=0;
        for(int i=0;i<arr.length;i++){
            long l=i-p[i];
            long r=n[i]-i;
            sum=(sum+(l*r*arr[i])%mod)%mod;
        }
         return (int)sum;
        }
        public static void main(String[] args) {
            LeetCode907 obj=new LeetCode907();
            System.out.println(obj.sumSubarrayMins(new int[]{3,1,2,4}));
        }
    }

