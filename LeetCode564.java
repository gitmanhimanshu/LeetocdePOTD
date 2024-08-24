import java.util.ArrayList;

public class LeetCode564 {

    public String nearestPalindromic(String n) {
        int l=n.length();
        int mid=(l%2==0)?l/2:l/2+1;
        boolean isodd=(l%2!=0);
        Long half=Long.parseLong(n.substring(0,mid));
        ArrayList<Long> ans=new ArrayList<>();
        ans.add(find(half,isodd));
        ans.add(find(half-1,isodd));
        ans.add(find(half+1,isodd));
        ans.add((long)(Math.pow(10, l-1)) - 1);
        ans.add((long)(Math.pow(10,l))+1);
       long mindiff=(Long.MAX_VALUE);
      Long a=(Long.MAX_VALUE);
        Long main=Long.parseLong(n);
       for(Long i: ans){
        if(i.equals(main)){
            continue;
        }
        long curdif=Math.abs(i-main);
        if(curdif<mindiff){
            mindiff=curdif;
            a=i;
        }else if(curdif==mindiff){
            a=Math.min(a,i);
        }
       }
     
        return Long.toString(a);
    }
    Long find(Long n,boolean isodd){
        Long ans=n;
        if(isodd){
 n=n/10;
        }
        while(n>0){
            ans=ans*10+(n%10);
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args) {
        LeetCode564 obj=new LeetCode564();
        System.out.println(obj.nearestPalindromic("123"));
    }
} 

