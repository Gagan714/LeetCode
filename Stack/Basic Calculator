class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<Integer>();
        int digit=0;
        int ans=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                digit=digit*10+(int)(c-'0');
            }else if(c=='+'){
                ans+=sign*digit;
                digit=0;
                sign=1;
            }else if(c=='-'){
                ans+=sign*digit;
                digit=0;
                sign=-1;
            }else if(c=='('){
                stack.push(ans);
                stack.push(sign);
                ans=0;
                sign=1;
            }else if(c==')'){
                ans+=sign*digit;
                digit=0;
                ans*=stack.pop();
                ans+=stack.pop();
            }
        }
        if(digit!=0){
            ans+=sign*digit;
        }
        return ans;
    }
}
