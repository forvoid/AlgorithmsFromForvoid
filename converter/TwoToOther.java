package converter;

import static converter.Tools.numberInversion;
import static converter.Tools.twoN;

/**
 * Created by tao on 16-9-11.
 * 二进制转化为其他进制
 */
public class TwoToOther {
    /**
     * 二进制转化为十进制
     * */
    public static String twoToTen(String TwoNumber){
        int TenNumber=0;
        TwoNumber=numberInversion(TwoNumber);
        for(int i = 0;i<TwoNumber.toString().length();i++){
            TenNumber += twoN(i)*Integer.parseInt(String.valueOf(TwoNumber.toString().charAt(i)));
        }
        return TenNumber+"";
    }
    /**
     * 正整数二进制转化为八进制
     * */
    public static String twoToOctal(String TwoNumber){
        String returnNumber="";
        int addNumber = TwoNumber.length()%3;
        switch (addNumber){
            case 0:break;
            case 1:TwoNumber ="00"+TwoNumber;break;
            case 2:TwoNumber = "0" +TwoNumber;break;
        }
        for(int i = 0;i<TwoNumber.length();i+=3){
            returnNumber +=twoToTen(TwoNumber.substring(i,i+3));

        }
        return returnNumber;
    }
    /**
     * 正整数二进制转化为十六进制
     * */
    public static String twoToHex(String TwoNumber){
        String returnNumber="";
        int addNumber = TwoNumber.length()%4;
        switch (addNumber){
            case 0:break;
            case 1:TwoNumber ="000"+TwoNumber;break;
            case 2:TwoNumber = "00" +TwoNumber;break;
            case 3:TwoNumber = "0" +TwoNumber;break;
        }
        for(int i = 0;i<TwoNumber.length();i+=4){
            String addString = twoToTen(TwoNumber.substring(i,i+4));
            switch(addString){
                case "10":addString="A";break;
                case "11":addString="B";break;
                case "12":addString="C";break;
                case "13":addString="D";break;
                case "14":addString="E";break;
                case "15":addString="F";break;
            }
            returnNumber +=addString;

        }
        return returnNumber;
    }
}
