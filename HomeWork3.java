package project3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        Task1(arr1);
        System.out.println("\n***");
        Task2(100);
        System.out.println("\n***");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Task3(arr3);
        System.out.println("\n***");
        Task4();
        System.out.println("\n***");
        Task5(8, 3);
        System.out.println("\n***");
        int[] arr6 = {1, 10, 0, 6, 4, 20, 3, 9, 4, 1, 91, 16, 5};
        Task6(arr6);
    }

    public static void Task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task2(int lengthArray) {
        int[] arr = new int[lengthArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void Task4() {
        int[][] arr = {
                {4, 5, 3, 4},
                {2, 6, 9, 1},
                {0, 1, 4, 8},
                {9, 4, 5, 4}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void Task5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task6(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            }
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            }
        System.out.println(min);
    }
}


