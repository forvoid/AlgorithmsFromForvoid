package converter;

import java.util.Scanner;
import static converter.TwoToOther.*;
import static converter.ConverOther.*;
import static converter.OtherToTwo.*;
/**
 * Created by tao on 16-9-11.
 */
public class ExecuteMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please input a number!(Binary || Octal || Decimal || Hexadecinal)");
        String number = in.nextLine();
        System.out.println("please input a NumberType!(Binary=b) || (Octal=o) || (Decimal=d) || (Hexadecinal=h)");
        switch (in.nextLine()){
            case "b":
                System.out.println("Octal : "+twoToOctal(number));
                System.out.println("Decimal : "+twoToTen(number));
                System.out.println("Hexadecinal : "+twoToHex(number));
                break;
            case "o":
                System.out.println("Binary : "+octalToTwo(number));
                System.out.println("Decimal : "+octalToTen(number));
                System.out.println("Hexadecinal : "+octalToHex(number));
                break;
            case "d":
                System.out.println("Binary : "+tenToTwo(number));
                System.out.println("Octal : "+tenToOctal(number));
                System.out.println("Hexadecinal : "+tenToHex(number));
                break;
            case "h":
                System.out.println("Binary : "+hexToTwo(number));
                System.out.println("Octal : "+hexToOctal(number));
                System.out.println("Decimal : "+hexToTen(number));
                break;
            default:
                System.out.println("input error!");
        }
    }
}
