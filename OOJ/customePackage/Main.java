package customePackage;

import customePackage.CIE.*;
import customePackage.SEE.*;

public class Main {
    public static void main(String[] args) {
        External e = new External();
        e.usn = "1BM22CS001";
        e.name = "Aniketan";
        e.sem = 3;

        for (int i = 0; i < 5; i++)
            e.seeMarks[i] = 70;

        System.out.println("USN: " + e.usn);
    }
}
