package main;


public class Array {
    public static void main(String[] args) {
        int[] arr1  = {1,2,32,266,259};
        int[] arr2  = {6,2,2,26,159};
        System.out.println("missing numbers in array is" + findNumber(arr1));
        System.out.println("missing mumbers in array is" + findNumber(arr2));
    }
    public static int findNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return sum - actualSum;
    }
}
