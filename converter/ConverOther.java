package converter;

import static converter.OtherToTwo.*;
import static converter.TwoToOther.*;

/**
 * Created by tao on 16-9-11.
 * 主要操作类操作类
 */
public class ConverOther {
    /**
     * 八进制到十进制
     * */
    public static String octalToTen(String octalNumber){

        return twoToOctal(octalToTwo(octalNumber));
    }
    /**
     * 八进制打到十六进制
     * */
    public static String octalToHex(String octalNumber){

        return twoToHex(octalToTwo(octalNumber));
    }
    /**
     * 十进制到八进制
     * */
    public static String tenToOctal(String tenNumber){

        return twoToOctal(tenToTwo(tenNumber));
    }
    /**
     * 十进制到十六进制
     * */
    public static String tenToHex(String tenNumber){

        return twoToHex(tenToTwo(tenNumber));
    }
    /**
     * 十六进制到八进制
     * */
    public static String hexToOctal(String hexNumber){

        return twoToOctal(hexToTwo(hexNumber));
    }
    /**
     * 十六进制到十进制
     * */
    public static String hexToTen(String hexNumber){

        return twoToTen(hexToTwo(hexNumber));
    }
}
