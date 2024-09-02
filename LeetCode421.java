public class LeetCode421 {
    class trie{
        trie left;
        trie right;
        trie(){
            this.left=null;
            this.right=null;
        }
    }
   
        void insert(int n,trie root){
            trie temp=root;
            for(int i=31;i>=0;i--){
                int bit=(n>>i)&1;
                if(bit==0){
                   if(temp.left==null){
                     temp.left=new trie();
                   }
                   temp=temp.left;
                }else{
                    if(temp.right==null){
                        temp.right=new trie();
                    }
                    temp=temp.right;
                }
            }
        }
        int find(int n,trie root){
            trie temp=root;
            int ans=0;
            for(int i=31;i>=0;i--){
                int bit=(n>>i)&1;
                if(bit==0){
                    if(temp.right!=null){
                        ans+=(int)Math.pow(2,i);
                        temp=temp.right;
                    }else{
                        temp=temp.left;
                    }
                }else{
                   if(temp.left!=null){
                        ans+=(int)Math.pow(2,i);
                        temp=temp.left;
                    }else{
                        temp=temp.right;
                    } 
                }
            }
            return ans;
        }
        public int findMaximumXOR(int[] nums) {
          trie root=new trie();
          for(int i:nums){
            insert(i,root);
          }  
          int ans=0;
          for(int i:nums){
            ans=Math.max(ans,find(i,root));
          }
          return ans;
        }
        public static void main(String[] args) {
            LeetCode421 obj=new LeetCode421();
            System.out.println(obj.findMaximumXOR(new int[]{3,10,5,25,2,8}));
        }
    }
