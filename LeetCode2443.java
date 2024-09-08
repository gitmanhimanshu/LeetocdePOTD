public class LeetCode2443 {
    public static void main(String[] args) {
  LeetCode2443 obj=new LeetCode2443();
  System.out.println(obj.sumOfNumberAndReverse(443));
    }
 
        public boolean sumOfNumberAndReverse(int num) {
          if(num==0){
            return true;
          }
           for(int i=num/2;i<num;i++){
                int reversedMid = Integer.parseInt(new StringBuilder(Integer.toString(i)).reverse().toString());
                int s=i+reversedMid;
                if(s==num){
                 
                  //  System.out.println(i+" "+reversedMid);
                    return true;
    
                }
            }
           return false;
        }
    }

