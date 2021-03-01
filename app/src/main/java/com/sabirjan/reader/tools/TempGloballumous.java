package com.sabirjan.reader.tools;

import java.util.Arrays;

/**
 * Created by Sabirjan on 2017/11/6.
 * Wlt2BmpDemo1.
 * 新疆精灵通电子科技有限公司
 */

public class TempGloballumous {
    //private static final int SEEK_SIZE = 14;
    //身份证安全模块返回的解码数据包 ，总 大小 14+256+1024（不带指纹）个字节，后面的1024是图片部分
    //下面的是只图片部分的数据
    public static byte[] GetWLTData(String dataStr) {
        try {
            byte[] data = HexUtillumous.hexStringToBytes(dataStr);
            byte[] wltData = Arrays.copyOfRange(data, 0, 0 + 1024);
            return wltData;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
