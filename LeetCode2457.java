import java.util.* ;
import java.io.*; 

public class LeetCode2457 {

	public static void main(String[] args) {
		LeetCode2457 obj=new LeetCode2457();
		System.out.println(obj.makeIntegerBeautiful(467L,6));
	}
	
		long add(long n){
			long ans=0;
			while(n>0){
				ans=ans+(n%10);
				n/=10;
				
			}
			return ans;
		}
		public long makeIntegerBeautiful(long n, int target) {
			long o=n;
			long div=10;
			long t=(long)target;
			if(add(n)<=target){
				return 0;
			}
			while(true){
				long nd=n%div;
				n=n/div;
				
				long d=(n%10);
			  
				n=((n/10)*10+(d+1))*(div);
				  //System.out.println(n+" "+add(n));
				if(add(n)<=t){
					return n-o;
				}
				n=o;
				div=div*10;
	
			}
		}
	}
	
	
	



