package per.kim;

import java.math.BigInteger;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
//        int result = 0;
//        int[] newDigits;
//
//        for (int i = 0; i < digits.length; i++) {
//            result = (result * 10) + digits[i];
//        }
//        int newResult = result + 1;
//
//        if (String.valueOf(newResult).length() > String.valueOf(result).length()) {
//            newDigits = new int[digits.length + 1];
//        } else {
//            newDigits = new int[digits.length];
//            if (digits.length >= 10) {
//                if (digits[digits.length - 1] == 9) {
//                    for (int i = 0; i < digits.length - 2; i++) {
//                        newDigits[i] = digits[i];
//                    }
//                    newDigits[newDigits.length - 2] = digits[digits.length - 2] + 1;
//                    newDigits[newDigits.length - 1] = 0;
//                    return newDigits;
//                } else {
//                    for (int i = 0; i < digits.length - 1; i++) {
//                        newDigits[i] = digits[i];
//                    }
//                    newDigits[newDigits.length - 1] = digits[digits.length - 1] + 1;
//                    return newDigits;
//                }
//            }
//        }
//
//            for (int i = newDigits.length - 1; i >= 0; i--) {
//                newDigits[i] = newResult % 10;
//                newResult = newResult / 10;
//            }
//            return newDigits;

//        int target = digits[digits.length - 1] += 1;

//        int target = digits[digits.length - 1] += 1;
//        String after = digits.toString();
//        if (after.length() > before.length()) {
//            int[] newDigits = new int[digits.length + 1];
//        }
//        for (int i = 0; i < digits.length; i++) {
//            if (target == 10) {
//                digits[digits.length - (i+1)] = 0;
//                target = digits[digits.length - (i+2)] += 1;
//            }
//            else {
//                break;
//            }
//        }
//        return digits;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }


    public static void main(String[] args) {
        int[] digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] digits2 = new int[]{9, 8, 9};
        int[] digits3 = new int[]{9};
        int[] newDigits = plusOne(digits);
        int[] newDigits2 = plusOne(digits2);
        int[] newDigits3 = plusOne(digits3);
    }
}
