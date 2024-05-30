import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение типа а+б");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }

    public static void test(String input) {
        String[] blocks = input.split("\\W");
        for (String s : blocks) {
            System.out.println(s);
        }
        String s1 = blocks[0];
        String s2 = blocks[1];
        System.out.println(romanToArabic(s1));
        System.out.println(romanToArabic(s2));
    }

    public static String calc(String input) {
        float a = 0;
        float b = 0;
        String result = "null";
        String[] s = input.split("\\W");
        String s1 = s[0];
        String s2 = s[1];
        boolean arabicnums = true;
        arabicnums = s1.matches("^-?\\d+$") && s2.matches("^-?\\d+$");
        if (arabicnums) {
            try {
                a = Float.parseFloat(s[0]);
                b = Float.parseFloat(s[1]);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        if (!arabicnums) {
            a = (float) romanToArabic(s1);
            b = (float) romanToArabic(s2);
        }
        for (String key : keys) {
            if (input.contains(key)) {
                operator = key;
                break;
            }
        }
        switch (operator) {
            case "*":
                result = String.valueOf(a * b);
            case "/":
                result = String.valueOf(a / b);
            case "+":
                result = String.valueOf(a + b);
            case "-":
                result = String.valueOf(a - b);
            default:
                System.out.println("Выражение не содержит оператора");
                break;
        }
        return result;
    }

    public static String[] keys = {"+", "/", "-", "*"};
    public static String operator = "";

    public static int romanToArabic(String romanNum) {
        HashMap<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        int arabicNum = 0;
        int preNum = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int num = romanNums.get(romanNum.charAt(i));

            if (num < preNum) {
                arabicNum -= num;
            } else {
                arabicNum += num;
            }

            preNum = num;
        }

        return arabicNum;
    }

}
