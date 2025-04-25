import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map <Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        
        Stack<Character> openBrackets = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            Character bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                openBrackets.push(bracket);
            } else {
                if (openBrackets.isEmpty()) {
                    openBrackets.push(bracket);
                    break;
                }
                Character openBracket = openBrackets.pop();
                if (bracket != brackets.get(openBracket)) {
                    openBrackets.push(openBracket);
                    break;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}