package com.example.hometask1;

public class HomeTask1 {

    public static void main(String[] args){
//1
        char a = '(';
        char b = ')';
        char c = (char) (a + b);
        System.out.println(c); //выводит Q, так как складывает номера по таблице АСКИ (40+41=81) и выводит символ под номером 81
        System.out.println(a+b);//выводит 81
        System.out.println((char)(a+b));//Q
//2
        byte byteMin = -128;
        System.out.println(byteMin);
        byte byteMax = 127;
        System.out.println(byteMax);

        short shortMin = -32768;
        System.out.println(shortMin);
        short shortMax = 32767;
        System.out.println(shortMax);

        int intMin = -2147483648;
        System.out.println(intMin);
        int intMax = 2147483647;
        System.out.println(intMax);

        long longMin = -0x8000000000000000L;
        System.out.println(longMin);
        long longMax = 0x7fffffffffffffffL;
        System.out.println(longMax);


        byte byteMin1 = Byte.MIN_VALUE; //with Ctrl + left mouse button you can go to the source
        byte byteMax1 = Byte.MAX_VALUE;
        short shortMin1 = Short.MIN_VALUE;
        short shortMax1 = Short.MAX_VALUE;
        int intMin1 = Integer.MIN_VALUE;
        int intMax1 = Integer.MAX_VALUE;
        long longMin1 = Long.MIN_VALUE;
        long longMax1 = Long.MAX_VALUE;


        System.out.println(byteMin1);
        System.out.println(byteMax1);
        System.out.println(shortMin1);
        System.out.println(shortMax1);
        System.out.println(intMin1);
        System.out.println(intMax1);
        System.out.println(longMin1);
        System.out.println(longMax1);

//3
        float p = (float) Math.PI;
        float r = 0.89f;
        float res = 2 * p * r;

        double r2 = 0.89;
        double p2 = Math.PI;
        double res2 = 2 * p2 * r2;

        System.out.println(res);
        System.out.println(res2);
        System.out.println("res == res2 ? " + (res == res2));


// Home Task #1
        System.out.println("Converter of physical quantities");
        int d = 1200;//m
        double mile = d* 0.00062;
        System.out.println(d + " m = " + (float)mile + " miles");
        double ft = d* 3.28084;
        System.out.println(d + " m = " + (float)ft + " ft");
        double yd = d* 1.09361;
        System.out.println(d + " m = " + (float)yd + " yd");

        int m = 900;//kg
        double lb = m* 2.20462;
        System.out.println(m + " kg = " + (float)lb + " lb.");
        double oz = m* 35.274;
        System.out.println(m + " kg = " + (float)oz + " oz.");
    }
}
