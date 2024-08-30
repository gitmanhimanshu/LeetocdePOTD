import java.util.Arrays;

class LeetCode2615{
    public static void main(String[] args) {
        LeetCode2615 obj=new LeetCode2615();
     
        System.out.println(obj.smallestNumber(2170596702L));
    }
    

    int count(long n) {
        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    public long smallestNumber(long num) {
        boolean neg = false;

        if (num < 0) {
            neg = true;
           
            num = num * -1;
        }
        long a[] = new long[count(num)];
        for (int i = 0; i < a.length; i++) {
                a[i] = num % 10;
                num = num / 10;
            }
           //  System.out.println(Arrays.toString(a));
            Arrays.sort(a);
           
        if (!neg) {
             
            long ans = 0;
            int c = 0;
            int i = 0;
            while (i < a.length && a[i] == 0) {
                i++;
                c++;
            }
            if(i==a.length){
                return 0;
            }
            ans = a[i];
           // System.out.println(a[i]+" "+c);
            while (c > 0) {
                ans = ans * 10 + 0;
                c--;
            }
            // System.out.println(ans);
            i++;
            while (i < a.length) {
                ans = ans * 10 + a[i++];
            }
            return ans;
        }else{
           long ans = 0;
           for(int i=a.length-1;i>=0;i--){
            ans=ans*10+a[i];
           }
           return -1*ans;
        }
    }
}
