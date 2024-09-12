public class LeetCode2506 {

        String find(String s){
    int a []=new int[26];
    for(Character i:s.toCharArray()){
        a[i-'a']++;
    }
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<a.length;i++){
        if(a[i]>0){
            ans.append(i);
        }
    }
    return ans.toString();
        }
        public int similarPairs(String[] words) {
            int ans=0;
            for(int i=0;i<words.length;i++){
                String h=find(words[i]);
                for(int j=i+1;j<words.length;j++){
                        if(h.equals(find(words[j]))){
                            ans++;
                        }
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            LeetCode2506 obj=new LeetCode2506();
            System.out.println(obj.similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}));
        }
    }

