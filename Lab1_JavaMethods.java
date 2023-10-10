import java.util.Scanner;

public class Lab1 {
    static Scanner input = new Scanner(System.in);
    static int per_square(int side) {
        return side * 4;
    }
    static int per_rec(int length, int width) {
        return 2 * (length * width);
    }
    static int area_sq(int side) {
        return side * side;
    }
    static int area_rec(int length, int width) {
        return length * width;
    }
    static double area_tri(int base, int height) {
        return 0.5 * (base * height);
    }
    static void println(String x) {
        System.out.println(x);
    }
    static void print(String x) {
        System.out.print(x);
    }
    
    
    public static void main(String[] args) {
        String formula;
        
        System.out.print("Type below the formula: ");
        formula = input.nextLine();
        
        switch (formula.toLowerCase()) {
            case "perimeter square":
                print("Enter side: ");
                int s = input.nextInt();
                println("Result: " + per_square(s));
                break;
            case "perimeter rectangle":
                print("Enter length: ");
                int l = input.nextInt();
                print("Enter width: ");
                int w = input.nextInt();
                println("Result: " + per_rec(l,w));
                break;
            case "area square":
                print("Enter side: ");
                int s2 = input.nextInt();
                println("Result: " + area_sq(s2));
                break;
            case "area rectangle":
                print("Enter length: ");
                int l1 = input.nextInt();
                print("Enter width: ");
                int w1 = input.nextInt();
                println("Result: " + area_rec(l1,w1));
                break;
            case "area triangle":
                print("Enter base: ");
                int b = input.nextInt();
                print("Enter height: ");
                int h = input.nextInt();
                println("Result: " + area_tri(b,h));
            break;
        }
    }
}
