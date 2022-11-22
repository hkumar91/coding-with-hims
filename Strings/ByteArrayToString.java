import java.nio.charset.StandardCharsets;

public class ByteArrayToString {
    public static void main(String[] args) {
        try {
            byte[] bytes = "hello world".getBytes();
            //creates a string from the byte array without specifying character encoding
            String s = new String(bytes);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
