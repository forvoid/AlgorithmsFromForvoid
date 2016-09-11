package converter;

/**
 * Created by tao on 16-9-11.
 */
public class Tools {
    public static int twoN(int n){
        int total=1;
        for(int i = 0;i<n;i++){
            total *= 2;
        }
        return total;
    }
    public static String numberInversion(String number){
        int halfNumber = number.length() /2;
        String tempNumber = null;
        if(halfNumber !=0) {//位数不为一位
                for (int i = 0; i < halfNumber; i++) {
                    tempNumber = String.valueOf(number.charAt(i));
                        number = number.substring(0, i ) + String.valueOf(number.charAt(number.length() - i-1))
                                + number.substring(i+1, number.length() - i-1) + tempNumber + number.substring(number.length() - i);
                }
        }else{
            return number;
        }
        return number;
    }


}
