import java.util.HashMap;
import java.util.Map;

public class LeetCode1347 {
  public static void main(String[] args) {
    LeetCode1347 obj=new LeetCode1347();
    System.out.println(obj.minSteps("bab", "aba"));
  }
    public int minSteps(String s, String t) {
        	int ans=0;
		Map<Character,Integer> him1=new HashMap<>();
	
		for(int i=0;i<s.length();i++){
			him1.put(s.charAt(i),him1.getOrDefault(s.charAt(i),0)+1);
				
		}
		for(int i=0;i<t.length();i++){
			if(him1.containsKey(t.charAt(i))){
				him1.put(t.charAt(i),him1.getOrDefault(t.charAt(i),0)-1);
				if(him1.get(t.charAt(i))==0){
					him1.remove(t.charAt(i));
				}
			}else{
				ans++;
			}
		}
		return ans;
    }
}

