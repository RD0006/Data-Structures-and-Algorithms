public class RemoveOutermostParentheses {
    
    public String removeOutermostParentheses(String s) {
        StringBuffer sb = new StringBuffer();

        int check = 0;

        for (char i : s.toCharArray()) {
            if (i == '(' && check++ > 0) sb.append(i);
            else if (i == ')' && check-- > 1) sb.append(i);
        }

        return sb.toString();
    }

}
