package DecoratorES;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MinusculeInputStream extends FilterInputStream {
    public MinusculeInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c: Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int decal, int lg) throws IOException {
        int res = super.read(b, decal, lg);
        for (int i = decal; i < decal + res; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return res;
    }
}
