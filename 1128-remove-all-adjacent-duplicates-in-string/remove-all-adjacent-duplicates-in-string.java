class Solution {
    public String removeDuplicates(String s) {
        char[]ch=s.toCharArray();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && ch[i]==st.peek()){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        String ans="";
        for(char c:st){
            ans=ans+c;
        }
        return ans;
        
    }
}