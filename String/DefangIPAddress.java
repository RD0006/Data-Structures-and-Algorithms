public class DefangIPAddress {
    
    public String defangIPAddr(String address) {
        StringBuffer sb = new StringBuffer();

        for (char i : address.toCharArray()) {
            if (i == '.') 
                sb.append("[.]");
            else
                sb.append(i);
        }

        return sb.toString();
    }

}
