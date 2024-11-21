//1st Questiom

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int n = 2;
        System.out.println("Number of occurrences of " + n + ": " + countOccurrences(arr, n));
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
}


//2nd Question

public class Main {
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        } 
        return reversedArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArray(arr);
        System.out.print("Reversed array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}

//3rd Question

public class Main {
    public static double sumGrid(double[][] grid) {
        double sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        double[][] grid = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };
        double result = sumGrid(grid);
        System.out.println("Sum of all elements in the grid: " + result);
    }
}

//4th Question 

public class Main {
  public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + ": " + fib(n));
    }
}
