import java.util.Arrays;

public class LeetCode1109 {
    public static void main(String[] args) {
        LeetCode1109 obj=new LeetCode1109();
        System.out.println(Arrays.toString(obj.corpFlightBookings(new int[][]{{1,2,10},{2,3,20},{2,5,25}}, 5)));
    }
   
        public int[] corpFlightBookings(int[][] bookings, int n) {
            int ans[]=new int[n];
            for(int a[]:bookings){
                int i=a[0]-1;
                int j=a[1];
                while(i<j){
                    ans[i]=ans[i]+a[2];
                    i++;
                }
            }
            return ans;
        }
    } 

