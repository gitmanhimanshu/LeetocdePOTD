import java.util.Arrays;

class LeetCode443{
    public static void main(String[] args) {
        LeetCode443 obj=new LeetCode443();
        System.out.println(obj.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
    String find(char []s){
          StringBuilder ans=new StringBuilder();
          int c=0;
          for(int i=0;i<s.length-1;i++){
            if(s[i]==s[i+1]){
                c++;
            }else if(s[i]!=s[i+1]){
                ans.append(s[i]);
                c++;
                if(c>1){
                           ans.append(c);
                }
         
                c=0;
            }
          }
          if(s.length>1){
            if(s[s.length-1]==s[s.length-2]){
                c++;
                ans.append(s[s.length-1]);
                ans.append(c);
            }else{
                ans.append(s[s.length-1]);
            }
          }else{
              ans.append(s[0]);
          }
            
           
           
           
            return ans.toString();
    }
    public int compress(char[] chars) {

        String a= find(chars);
        for(int i=0;i<a.length();i++){
            chars[i]=a.charAt(i);
        }
        System.out.println(12&9);
        chars=Arrays.copyOf(chars,a.length());
        System.out.println(Arrays.toString(chars));
        return a.length();
    }
}
