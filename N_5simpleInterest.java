import java.util.Scanner;

public class N_5simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle");
        float p = sc.nextFloat();

        System.out.println("Enter rate of Interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("Principle" + p);
        System.out.println("Rate" + r);
        System.out.println("Time" + t);

        System.out.println("Simple Interest" + si);
    }
}