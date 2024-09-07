import java.util.Arrays;

public class LeetCode2384 {
   public static void main(String[] args) {
    LeetCode2384 obj=new LeetCode2384();
    System.out.println(obj.largestPalindromic("444947137"));
   }
    public String largestPalindromic(String num) {
        int a[]=new int[10];
      String s="adskassda";
      for(int i=0;i<num.length();i++){

        a[num.charAt(i)-'0']++;
       // num=num/10;
      }
     System.out.println(Arrays.toString(a));
      StringBuilder first=new StringBuilder();
      StringBuilder Second=new StringBuilder();
      for(int i=a.length-1;i>=0;i--){
  if(a[i]>=2){
    int k=a[i]/2;
    for(int j=0;j<k;j++){
        first.append(i);
        Second.append((i));
    }
  }
  
      }
     
       
      for(int i=a.length-1;i>=0;i--){
        if(a[i]%2!=0){
            first.append(i);
            break;
        }
      }
      first.append(Second.reverse());
     
       while(first.length()>1&&first.charAt(0)=='0'){
        first.deleteCharAt(0);
      }
      while(first.length()>1&&first.charAt(first.length()-1)=='0'){
         
        first.deleteCharAt(first.length()-1);
      }
      return first.toString();
    }
}

