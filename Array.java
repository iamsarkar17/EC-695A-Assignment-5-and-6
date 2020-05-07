import java.util.Scanner;

public class Array
    {
        int n;
        int arr[];
            void input()
            {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter the array size:");
                n=in.nextInt();
                arr = new int[n];
                System.out.println("Enter the array elements:");
                for(int i=0;i<n;i++)
                {
                    arr[i]=in.nextInt();
                }
            }
            void ascending()
            {
                //int n = arr.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (arr[j] > arr[j+1])
                        {
                            // swap temp and arr[i]
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                System.out.println("The sorted array in ascending order is:");
                for(int i=0;i<n;i++)
                {
                    System.out.println(arr[i]+" ");
                }
            }

            void descending()
            {
                //int n = arr.length;
                for (int i = 0; i < n-1; i++)
                    for (int j = 0; j < n-i-1; j++)
                        if (arr[j] < arr[j+1])
                        {
                            // swap temp and arr[i]
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                System.out.println("The sorted array in descending order is:");
                for(int i=0;i<n;i++)
                {
                    System.out.println(arr[i]+" ");
                }
            }

            public static void main(String args[])
            {
                Array ob=new Array();
                ob.input();
                ob.ascending();
                ob.descending();
            }
        }
