package com.example.hometask2;

public class HomeTask2 {

    public static void main(String[] args) {

        byte[][] matrixA;
        matrixA = new byte[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boolean flag = true;
                while (flag) {
                    flag = false;
                    byte p = (byte) (Math.random() * 10);
                    for (int q = 0; q < i; q++) {
                        if (p == matrixA[q][j]) {
                            flag = true;
                        }
                    }

                    for (int f = 0; f < j; f++) {
                        if (p == matrixA[i][f]) {
                            flag = true;
                        }
                    }
                    matrixA[i][j] = p;

                }
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

    }
}


