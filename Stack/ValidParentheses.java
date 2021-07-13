/* Time Complexity - O(n)
   Auxiliary Space - O(n)
*/
class ValidParentheses {
    
    public boolean isValid(String s) {

        // Using ArrayDeque is faster than using Stack class.
        Deque<Character> stack = new ArrayDeque<Character>();
                
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current =='(' || current == '[' || current == '{') {
                stack.push(current);
            }
            if(stack.isEmpty()) {
                return false;
            }
            else if(( current == ')' && stack.pop()!='(')
                    || (current == ']' && stack.pop()!='[')
                    || (current == '}' && stack.pop()!='{')) {
                return false;
            }
        }
        return (stack.isEmpty());
    }
}
