package dataStructure;

import java.util.Set;
import java.util.Stack;

public class BracketBalancing {
    public boolean solveExpression(String expression) {
        Set<Character> openingSymbols = Set.of('(', '{', '[');
        Set<Character> closingSymbols = Set.of(')', '}', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openingSymbols.contains(c)) stack.push(c);
            if (closingSymbols.contains(c)) {
                if (stack.isEmpty()) return false;

                var openingSymbol = stack.pop();

                if (openingSymbol == '(' && c != ')') return false;
                if (openingSymbol == '{' && c != '}') return false;
                if (openingSymbol == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }
}
