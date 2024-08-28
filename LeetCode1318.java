public class LeetCode1318 {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=5;
        LeetCode1318 obj=new LeetCode1318();
        System.out.println(obj.minFlips(a, b, c));
    }
            public int minFlips(int a, int b, int c) {
                int ans=0;
                while(a!=0||b!=0||c!=0){
                    int ae=a&1;
                    int be=b&1;
                    int ce=c&1;
                    if(ce==1&&(ae!=1&&be!=1)){
                            ans++;
                    }else if(ce==0){
                        if(ae==1&&be==1){
                            ans+=2;
                        }else if(ae!=0||be!=0){
        ans++;
                        }
                    }
                    a=a>>1;
                    b=b>>1;
                    c=c>>1;
                }
                return ans;
            }
        }

