package com.sabirjan.reader.tools;

public class WltDecodeUtil {

    public native int Wlt2Bmp(byte[] wlt, byte[] bmp);

    public native int wlt2bmptest(byte[] wlt, byte[] bmp);

    static {
        System.loadLibrary("wlt2bmp1lumous");
    }
}
