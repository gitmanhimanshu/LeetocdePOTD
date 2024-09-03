public class LeetCode1945 {
   
        public int getLucky(String s, int k) {
            int cal = 0;
            for (int i = 0; i < s.length(); i++) {
                int l = s.charAt(i) - 'a'+1;
                while (l > 0) {
                    cal += l % 10;
                    l = l / 10;
                }
    
            }
            if (k == 1) {
                return cal;
            }
            //System.out.println(cal);
            
            k--;
           
            while (k > 0) {
               int n = cal;
                cal = 0;
                while (n > 0) {
                    cal += n % 10;
                    n = n / 10;
                }
                k--;
            }
    
            return cal;
        }
        public static void main(String[] args) {
            LeetCode1945 obj=new LeetCode1945();
            System.out.println(obj.getLucky("leetcode", 2));
        }
    }

