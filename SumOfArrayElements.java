import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        int n;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number of elements to store");
        n= sc.nextInt();

        // creating array memory
        int[] arr = new int[n];
        System.out.println("Entre the elements of the array");

        for(int i=0; i<n; i++) {
            // read array elements from user
            arr[i] = sc.nextInt();
        }
         // calculate the sum of elements in array
            for (int i=0; i<arr.length; i++) {
                sum = sum + arr[i];

        }
        System.out.println("Sum of elements in array:" + sum);
    }
}
