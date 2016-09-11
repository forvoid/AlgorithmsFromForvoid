package converter;

import static converter.Tools.numberInversion;

/**
 * Created by tao on 16-9-11.
 * 其他进制转化为二进制
 */
public class OtherToTwo {
    /**
     * 十进制转化为二进制
     * */
    public static String tenToTwo(String tenNumber){
        int ten = Integer.parseInt(tenNumber);
        String returnString = "";
        while(ten!=0){
            returnString+= ten%2;
            ten = (ten-ten%2)/2;
        }
        returnString = numberInversion(returnString);
        return returnString;
    }
    /**
     * 八进制转化为二进制
     * */
    public static String octalToTwo(String octalNumber){
        String returnString = "";
        for(int i = octalNumber.length()-1; i>=0; i--)
            if (i == 0) {
                returnString += tenToTwo(String.valueOf(octalNumber.charAt(i)));
            } else {
                String tempString = "";
                if (String.valueOf(octalNumber.charAt(i)).equals("0")) {
                    tempString = "000";
                } else {
                    tempString = tenToTwo(String.valueOf(octalNumber.charAt(i)));
                    switch (tempString.length()) {
                        case 1:
                            tempString = "00" + tempString;
                            break;
                        case 2:
                            tempString = "0" + tempString;
                            break;
                        default:
                            break;
                    }
                }
                returnString += tempString;
            }
        return numberInversion(returnString);
    }
    public static String hexToTwo(String hexNumber){
        String returnString = "";
        for(int i = 0;i<hexNumber.length();i++){
            String tempNumberByTen="";
            switch(String.valueOf(hexNumber.charAt(i))){
                case "A":tempNumberByTen="10";break;
                case "B":tempNumberByTen="11";break;
                case "C":tempNumberByTen="12";break;
                case "D":tempNumberByTen="13";break;
                case "E":tempNumberByTen="14";break;
                case "F":tempNumberByTen="15";break;
                default:tempNumberByTen = String.valueOf(hexNumber.charAt(i));break;
            }
            if(i == 0){
                returnString += tenToTwo(tempNumberByTen);
            }else{
                String tempString = "";
                if (tempNumberByTen.equals("0")) {
                    tempString = "0000";
                } else {
                    tempString = tenToTwo(tempNumberByTen);
                    switch (tempString.length()) {
                        case 1:
                            tempString = "000" + tempString;
                            break;
                        case 2:
                            tempString = "00" + tempString;
                            break;
                        case 3:
                            tempString = "0" + tempString;
                            break;
                        default:
                            break;
                    }
                }
                returnString += tempString;
            }
        }
        return returnString;
    }

}
