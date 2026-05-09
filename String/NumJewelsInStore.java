public class NumJewelsInStore {
    
    public int numJewelsInStones(String jewels, String stones) {

        int cnt = 0; 

        for (char stone: stones.toCharArray()) 
            if (jewels.indexOf(stone) != -1) 
                cnt++;

        return cnt;
    }
    
}
