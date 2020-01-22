package work13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String symbol = scanner.next();
        String s = " ";
        String а = (s + s + symbol + s + symbol + s + symbol + "\n"
                + s  + s  + s + s + s + s + symbol + "\n"
                + s  + s  + s + s + s + s + symbol + "\n"
                + symbol + s  + s + s + s + s + symbol + "\n"
                + s  + symbol + s + symbol + s + symbol + s + "\n" + "\n");
       String b = (s + s + s + s + symbol + s + s + s + s + "\n"
               + s + s + s + symbol + s + symbol + s + s + s + "\n"
               + s + s + symbol + s + s + s + symbol + s + s + "\n"
               + s + symbol + s + symbol + s + symbol + s + symbol + s + "\n"
               + symbol + s + s + s + s + s + s + s + symbol + "\n" + "\n");
        String c = (symbol + s + s + s + s + s + s + s + symbol + "\n"
                + s + symbol + s + s  + s + s + s + symbol + s + "\n"
                + s + s + symbol + s + s + s + symbol + s + s + "\n"
                + s + s + s + symbol + s + symbol + s + s + s + "\n"
                + s + s + s + s + symbol + s + s + s + s + "\n" + "\n");
        System.out.println(а + b + c + b) ;
    }
}
