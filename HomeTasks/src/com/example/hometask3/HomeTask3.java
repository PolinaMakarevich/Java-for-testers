package com.example.hometask3;

public class HomeTask3 {
    public static void main(String[] args) {

        String password = "Qwerty123";
        int strLength = password.length();
        char[] chArray = password.toCharArray();

        if ((strLength < 8) || (!isUpper(chArray)) || (!isLower(chArray)) || (!isNumber(chArray))) {
            System.out.println("Password is not crypto-resistant");
        } else {
            System.out.println("Password is crypto-resistant");
        }
    }

    private static boolean isUpper(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Character.isUpperCase(a[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLower(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Character.isLowerCase(a[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumber(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                return true;
            }
        }
        return false;
    }
}
