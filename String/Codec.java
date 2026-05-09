import java.util.HashMap;

public class Codec { 
    HashMap<Integer, String> hm = new HashMap<>();
    int cnt = 1;
    private static final String base = "http://tinyurl.com/abcd";

    public String encode(String longUrl) {
        String tinyUrl = base + cnt;

        hm.put(cnt++, longUrl);

        return tinyUrl;
    }

    public String decode(String shortUrl) {
        return hm.get(
            Integer.parseInt(
                shortUrl.substring(shortUrl.indexOf('d') + 1, shortUrl.length())
            )
        );
    }
}