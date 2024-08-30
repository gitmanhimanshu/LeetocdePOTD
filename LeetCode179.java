import java.util.Arrays;

public class LeetCode179 {
    public static void main(String[] args) {
LeetCode179 obj=new LeetCode179();
System.out.println(obj.largestNumber(new int[]{3,30,34,5,9}));
    }

    public String largestNumber(int[] nums) {
        Integer num[]=new Integer[nums.length];
        int k=0;
        for(int i:nums){
            num[k++]=i;
        }
        Arrays.sort(num,(a,b)->{
String a1=a+""+b;
String a2=(b+""+a);
return a2.compareTo(a1);
        });
        StringBuilder ans=new StringBuilder();
        for(Integer i:num){
            ans.append(i);
        }
        if(num[0]==0){
            return "0";
        }
        return ans.toString();


    }
}
