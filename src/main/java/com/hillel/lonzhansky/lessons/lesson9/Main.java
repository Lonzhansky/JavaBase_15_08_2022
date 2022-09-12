package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][] array = new int[5][3];

//        System.out.println(array.length);
//        System.out.println(array[0].length);

//        System.out.println(Arrays.toString(array[0]));
//        System.out.println(Arrays.toString(array[1]));
//        System.out.println(Arrays.toString(array[2]));


//        int counter = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = counter;
//                counter++;
//            }
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        System.out.println(Arrays.deepToString(array));


//        int[][] array2 = {
//                {10, 11, 12, 13, 14},
//                {20, 21, 22, 23, 24},
//                {30, 31, 32, 33, 34},
//                {40, 41, 42, 43, 44},
//        };
//
//        System.out.println(array2.length);
//        System.out.println(array2[0].length);

//        int[][] array2 = {
//                {1},
//                {20, 21},
//                {30, 31, 32, 33, 34},
//                {40, 41, 42},
//                {},
//                {99, 98, 97, 98}
//        };

//        System.out.println(array2.length);
//        System.out.println(array2[0].length);
//        System.out.println(array2[1].length);
//        System.out.println(array2[2].length);
//        System.out.println(array2[3].length);
//        System.out.println(array2[4].length);
//        System.out.println(array2[5].length);

//        System.out.println();
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                System.out.print(array2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        int[][] array3 = new int[0][0];
//        System.out.println(Arrays.deepToString(array3));
//
//        array3[1][0] = 88;



        int[][][] array = {
                {
                        {18, 28, 18, 28},
                        {45, 90, 45, 0}
                },
                {
                        {7, 125, 500, 5},
                        {0, 11, 25, 30}
                },
                {
                        {81, 17, 19, 55},
                        {1, 7, 38, 11}
                }
        };


//        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
//        System.out.println(Arrays.toString(array[1][1]));


        System.out.println();
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[0][0].length);


    }



    static void task3() {
        // ТРАНСПОНУВАННЯ МАТРИЦI
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i]= temp;
            }
        }

        System.out.println("AFTER");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }



    static void task12() {

// За допомогою циклів створити шахівницю 8х8 виду:
//
// B W B W B W B W  // 00, 02, 04, 06 - 0, 2, 4, 6
// W B W B W B W B  // 11, 13, 15, 17 - 2, 4, 6, 8
// B W B W B W B W  // 20, 22, 24, 26 - 2, 4, 6, 8
// W B W B W B W B  // 31, 33, 35, 37 - 4, 6, 8, 10
// B W B W B W B W
// W B W B W B W B
// B W B W B W B W
// W B W B W B W B


        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = 'B';
//                } else {
//                    array[i][j] = 'W';
//                }

                array[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }




    static void task1() {
        // Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

// 1 0 0 0 0            // 0 0
// 0 1 0 0 0            // 1 1
// 0 0 1 0 0            // 2 2
// 0 0 0 1 0            // 3 3
// 0 0 0 0 1            // 4 4

// 1 0 0 0 1            // 0 4  = 4
// 0 1 0 1 0            // 1 3  = 4
// 0 0 1 0 0            // 2 2  = 4
// 0 1 0 1 0            // 3 1  = 4
// 1 0 0 0 1            // 4 0  = 4

        int[][] array = new int[5][5];
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                counter++;
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//        System.out.println(counter);
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (i + j == array.length - 1) {
                array[i][j] = 1;
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
