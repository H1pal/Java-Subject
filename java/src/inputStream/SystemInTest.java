package inputStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        int alpha;
        alpha = System.in.read();
        System.out.println((char) alpha);
    }
}
