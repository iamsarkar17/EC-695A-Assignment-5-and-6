import java.util.Scanner;

interface Shapes
    {
        void sphere(double sr);
        void cone(double cr,double h);
    }
public class Volume implements Shapes //inheriting the properties of Shapes interface
    {
        public void sphere(double sr) //calculate and display the volume of sphere
        {
            double sv=((4/3)*(22/7))*Math.pow(sr,3);
            System.out.println("Volume of the sphere: "+sv);
        }

        public void cone(double cr, double h) //calculate and display the volume of cone
        {
            double cv=(((1/3)*(22/7))*h)*(cr*cr);
            System.out.println("Volume of the cone: "+cv);
        }

        public static void main(String args[])
        {
            double sr; //stores the sphere radius
            double cr, h; //stores the cone radius and height respectively
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the radius of the sphere:");
            sr=in.nextDouble();
            System.out.println("Enter the radius and height of the cone:");
            cr=in.nextDouble();
            h=in.nextDouble();
            Volume ob=new Volume(); //object reference created
            ob.sphere(sr);
            ob.cone(cr,h);
        }
    }
