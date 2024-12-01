package angle.pkg1;

import java.util.Scanner;

public class Angle1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of X1");
        double X1 = input.nextInt();
        System.out.println("Please enter the value of  Y1");
        double Y1 = input.nextInt();
        System.out.println("Please enter the value of X2");
        double X2 = input.nextInt();
        System.out.println("Please enter the value of Y2");
        double Y2 = input.nextInt();
        System.out.println("Please enter the value of X3 ");
        double X3 = input.nextInt();
        System.out.println("Please enter the value of Y3");
        double Y3 = input.nextInt();
        
        double a = (double) Math.sqrt(Math.pow(X3 - X2, 2) + Math.pow(Y3 - Y2, 2));
        double b = (double) Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        double c = (double) Math.sqrt(Math.pow(X3 - X1, 2) + Math.pow(Y3 - Y1, 2));
        double C =Math.toDegrees( Math.acos(((a * a) +(b * b) - (c * c)) / (2 * a* b)));
        double B = Math.toDegrees(Math.acos(((a*a) + (c*c) - (b*b)) / (2 * a * c)));
        double A = Math.toDegrees(Math.acos(((c * c) + (b * b) - (a*a)) / (2 * b * c)));
        System.out.println("The Angle of A is" + A);
        System.out.println("The Angle of B is" + B);
        System.out.println("The Angle of C is" + C);

    }

}
