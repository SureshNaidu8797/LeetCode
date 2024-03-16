class Solution {
    public boolean isValid(String s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
        //     st.push(s.charAt(i));   
        //     continue;  
        //     }
        //     if(st.size()==0)
        //     return false;
        //     else if( (s.charAt(i)==')' && st.pop()=='(') || (s.charAt(i)==']' &&st.pop()=='[') || (s.charAt(i)=='}' &&st.pop()=='{') )
        //     continue;
        //     else
        //     return false;
        // }
        // if(st.size()==0)
        // return true;
        // return false;

    Stack<Character> stack = new Stack<>();
    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;

    return stack.isEmpty();
    }
}