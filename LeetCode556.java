/**
 * LeetCode556
 */
public class LeetCode556 {
public static void main(String[] args) {
    LeetCode556 obj=new LeetCode556();
    System.out.println(obj.nextGreaterElement(123));
}

        int count(int n){
            int c=0;
            
            while(n>0){
                n/=10;
                c++;
            }
            return c;
        }
        public int nextGreaterElement(int n) {
        
        int a[]=new int[count(n)];
        for(int i=a.length-1;i>=0;i--){
            a[i]=n%10;
            n/=10;
        }
    // System.out.println(Arrays.toString(a));
    int ind=-1;
    for(int i=a.length-2;i>=0;i--){
        if(a[i]<a[i+1]){
            ind=i;
            break;
        }
    }
    if(ind==-1){
        return -1;
    }
    for(int i=a.length-1;i>ind;i--){
        if(a[i]>a[ind]){
            int t=a[ind];
            a[ind]=a[i];
            a[i]=t;
            break;
        }
    }
    int s=ind+1;
    int e=a.length-1;
    while(s<e){
        int t=a[s];
        a[s]=a[e];
        a[e]=t;
        s++;
        e--;
    }
    long ans=0;
    for(int i=0;i<a.length;i++){
        ans=ans*10+a[i];
    }
    
    if(ans>Integer.MAX_VALUE||ans<n){
        return -1;
    }
    return (int)ans;
            
        }
    }
