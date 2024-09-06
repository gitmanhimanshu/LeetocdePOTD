public class LeetCode824 {
    public static void main(String[] args) {
        LeetCode824 obj=new LeetCode824();
        System.out.println(obj.toGoatLatin("I speak Goat Latin"));
    }
 
        boolean isVowel(char ch){
            return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='U'||ch=='O';
        }
        public String toGoatLatin(String sentence) {
            StringBuilder ans=new StringBuilder();
            String a[]=sentence.split(" ");
            int j=1;
            for(String i:a){
                if(!isVowel(i.charAt(0))){
                    ans.append(i.substring(1));
                    ans.append(i.charAt(0));
                }else{
                    ans.append(i);
                }
                ans.append("ma");
                for(int k=1;k<=j;k++){
                    ans.append('a');
                }
               
                if(j!=a.length){
                ans.append(" ");
                }
     j++;
            }
            return ans.toString();
        }
    }
