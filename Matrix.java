import java.util.Scanner;

public class Matrix
{
    int n;
    int arr1[][], arr2[][], sum[][];

    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array1 and array2 size:"); //considering the matrix is n*n
        n = in.nextInt();
        arr1 = new int[n][n];
        arr2 = new int[n][n];
        sum = new int[n][n];
        System.out.println("Enter the array1 elements:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the array2 elements:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr2[i][j] = in.nextInt();
            }
        }
    }

    void add() {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of array1 and array2 elements is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Matrix ob = new Matrix();
        ob.input();
        ob.add();
    }
}

