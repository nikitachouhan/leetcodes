class ValidParentheses {
    
    public boolean isValid(String s) {
        // Using ArrayDeque is faster than using Stack class.
        Deque<Character> stack = new ArrayDeque<Character>();
                
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            try {
                if(current =='(' || current == '[' || current == '{') {
                    stack.push(current);
                }
                else if(( current == ')' && stack.pop()!='(')
                        || (current == ']' && stack.pop()!='[')
                        || (current == '}' && stack.pop()!='{')) {
                    return false;
                }
            }   
            catch(Exception e){
                return false;    
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
