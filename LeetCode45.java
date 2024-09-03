public class LeetCode45 {
    
        public int jump(int[] nums) {
      int n = nums.length;
            if (n == 1) {
                return 0;
            }
                   int j = 0;
            int curr = 0;
            int nxt = 0;
    
            for (int i = 0; i < n - 1; i++) {
                nxt = Math.max(nxt, i + nums[i]);
                
                if (i == curr) {
                    j++;
                    curr = nxt;
                  
                    if (curr >= n - 1) {
                        break;
                    }
                }
            }
    
            return j;
    
        }
        public static void main(String[] args) {
            LeetCode45 obj=new LeetCode45();
            System.out.println(obj.jump(new int[]{2,3,1,1,4}));
        }
       
    }

