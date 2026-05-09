public class ConvertDateToBinary {
    
    public String convertDateToBinary(String date) {
        String [] date_split = date.split("-");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 3; i++) {
            sb.append(Integer.toBinaryString(Integer.parseInt(date_split[i])));
            if (i != 2) sb.append("-");
        }

        return sb.toString();
    }

}
