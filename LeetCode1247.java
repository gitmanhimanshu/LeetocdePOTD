public class LeetCode1247 {
   
        public int minimumSwap(String s1, String s2) {
            int xy=0;
            int yx=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='x'&&s2.charAt(i)=='y'){
                    xy++;
                }
                if(s1.charAt(i)=='y'&&s2.charAt(i)=='x'){
                    yx++;
                }
            }
            if((xy+yx)%2!=0){
                return -1;
            }
            return (xy/2+yx/2+(xy%2)*2);
        }
        public static void main(String[] args) {
            LeetCode1247 obj=new LeetCode1247();
            System.out.println(obj.minimumSwap("xx", "yy"));
        }
    }

