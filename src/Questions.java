import java.util.Arrays;

public class Questions {

    //#1
    public static int[] ascending(int[] intArry) {
        Arrays.sort(intArry);
        return intArry;
    }

    //#2
    public static int countWords(String str) {
        return str.split(" ").length;
    }

    //#3
//    public static void calculator(int num1, char operator, int num2) {
//        switch (operator) {
//            case '+':
//                System.out.printf("%s %s %s = %s", num1, operator, num2, num1 + num2);
//            case '-':
//
//        }
//    }

    public static void cardHidden(String cardNum) {
        if (cardNum.length() != 16) {
            System.out.println("That is not a proper card number");
        }
        System.out.println("************" + cardNum.substring(12));
    }

    public static void reverseOdd(String str) {
        String[] strs = str.split(" ");
        for (String word : strs) {
            if (word.length() % 2 == 1) {
                System.out.println(word.);
            }
        }
    }

}
