package DecoratorES;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestEntree {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            // utiliser des Reader pour UTF-8
            InputStream in = new MinusculeInputStream(new BufferedInputStream(new FileInputStream("DecoratorES/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
