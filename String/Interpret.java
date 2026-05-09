public class Interpret {
    
    public String interpret(String command) {
        StringBuffer sb = new StringBuffer(command);

        String res = "";

        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == 'G') {
                res += "G";
                i++;
            }
            
            else if (sb.substring(i, i + 2).equals("()")) {
                res += "o";
                i += 2;
            }

            else {
                res += "l";
                res += 4;
            }
        }

        return res;
    }

}
