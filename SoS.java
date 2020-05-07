import java.util.Scanner;

public class SoS
    {
        int n, s;

        void input() //function to take input
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the n-th term of the series:");
            n=in.nextInt(); //stores the n-th term
        }

        void calculate() //function calculate the sum
        {
            s=(n*(n+1)*((2*n)+1))/6; //stores the sum upto the n-th term
        }

        void display() //function display the sum
        {
            System.out.println("Sum of the series upto n-th term is: "+s);
        }

        public static void main(String args[])
        {
            SoS ob=new SoS(); //object reference created
            ob.input();
            ob.calculate();
            ob.display();
        }
    }
