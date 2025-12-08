public class Codec {
    private Map<String, String> map = new HashMap<>();

    private int id = 0;

    private final String HOST = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        String key = String.valueOf(id);

        map.put(key, longUrl);

        return HOST + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(HOST, "");

        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));