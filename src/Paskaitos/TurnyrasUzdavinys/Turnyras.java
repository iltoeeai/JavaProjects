package Paskaitos.TurnyrasUzdavinys;

import java.io.InputStream;
import java.io.OutputStream;

public class Turnyras {

    private InputStream is;
    private OutputStream out;

    public Turnyras(InputStream is, OutputStream out) {
        this.is = is;
        this.out = out;
    }

    public void execute(){}
}
