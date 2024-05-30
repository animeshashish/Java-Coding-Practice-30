import java.util.Scanner;

public class ElementsInArray {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n= sc.nextInt();

        // creating array memory
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");

        for(int i=0; i<n; i++) {
            // read array elements from user
            arr[i] = sc.nextInt();

        }
        System.out.println("Elements in array are:");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]); // print array elements.
        }

    }

}
