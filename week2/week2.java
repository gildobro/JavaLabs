package week2;

import java.util.*;

public class week2 {

    public static int summation(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int num1, int num2, int num3) {
        return summation(num1, num2, num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /*
         * int a = 5; System.out.println("The value of a = " + a);
         * 
         * 
         * // 1) create an object out of the class scanner // 2) we have have access to
         * non-static methods to read the inputs. // 3) prompt to the user // of string!
         * --> sometimes you need to type cast them
         * System.out.println("Enter your name: "); String name = keyboard.nextLine();
         * System.out.println("Enter your last name: "); String lastName =
         * keyboard.nextLine(); System.out.println("your full name is " + name + " " +
         * lastName); System.out.println("tell me age and I double it!"); int age =
         * keyboard.nextInt(); System.out.println(age*2);
         * 
         * 
         * System.out.println("enter three integers: "); int num1 = keyboard.nextInt();
         * int num2 = keyboard.nextInt(); int num3 = keyboard.nextInt();
         * System.out.println("the sum oof those inputs is" + summation(num1, num2,
         * num3)); // () * /% +-
         * 
         * System.out.println("The average is: " + average(num1, num2, num3));
         */
        // -------------------Arrays----------------------
        // A collection of same type variables in sequence
        int[] marks = { 70, 80, 90 }; // declaring an array in java
        double marks2[] = new double[5]; // empty arrays with size of 5
        String names[] = new String[5];
        // arrays are not dyanmic means you need to declare the size

        System.out.println("the average is " + average(marks[0], marks[1], marks[2]));

        System.out.print("[");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ",");
        }
        System.out.print("]");

        System.out.println("\n\n\n" + Arrays.toString(marks));

        String stdName[] = { "Gil", "Hasem", "Michael" };
        System.out.println(Arrays.toString(stdName));
        // ----------------Multi Dimentional Arrays---------------------------
        // array list accept only object!
        int[][] board = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        int[][][] board3D = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } },
                { { 13, 14 }, { 15, 16 }, { 17, 18 } } };
        int[][][] board3d = new int[3][][]; // matrix
        board3d[0] = new int[2][];
        board3d[1] = new int[3][];
        System.out.println(Arrays.toString(board3D));

        for (int i = 0; i < board3D.length; i++) {
            for (int j = 0; j < board3D[i].length; j++) {
                for (int k = 0; k < board3D[i][j].length; k++) {
                    System.out.println("board3D[" + i + "][" + j + "][" + k + "]=" + board3D[i][j][k]);
                }
            }
        }

        int sum = 0;
        int counter = 0;
        // for each/ enhanced loop
        for (int[][] board2d : board3D) {

            for (int[] list : board2d) {

                for (int num : list) {
                    sum += num;
                    counter++;
                }

            }

        }
        System.out.println("The sum of the array Board3D = " + sum);
        System.out.println("The Average: " + (double) sum / counter);
    }
}
