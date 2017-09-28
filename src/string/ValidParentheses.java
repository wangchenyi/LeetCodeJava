package string;

import java.util.Stack;

public class ValidParentheses {
//
//    public boolean isValid(String s) {
//        String[] arr = s.split("");
//        Stack<String> stack = new Stack<String>();
//        boolean flag = true;
//        for(int i = 0; i < s.length(); i++){
//            if(isLeft(arr[i]))
//                stack.push(arr[i]);
//            else if(isRight(arr[i])){
//                if(stack.empty() || !isMatch(stack.pop(), arr[i])){
//                    flag = false;
//                    break;
//                }
//            }
//        }
//        return flag && stack.empty();
//    }
//
//    private boolean isLeft(String s){
//        return s.equals("(") || s.equals("[") || s.equals("{");
//    }
//
//    private boolean isRight(String s){
//        return s.equals(")") || s.equals("]") || s.equals("}");
//    }
//
//    private boolean isMatch(String left, String right) {
//        return left.equals("(") && right.equals(")") ||
//                left.equals("[") && right.equals("]") ||
//                left.equals("{") && right.equals("}");
//    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.empty()) {
                st.push(ch);
            } else {
                char prev = st.peek();
                if (prev == '(' && ch == ')' || prev == '[' && ch == ']' || prev == '{' && ch == '}') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        return st.empty()? true : false;
    }
}
