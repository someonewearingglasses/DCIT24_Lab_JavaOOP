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
        
        if (formula.equalsIgnoreCase("PERIMETER SQUARE")) {
            print("Enter side: ");
            int s = input.nextInt();
            println("Result: " + per_square(s));
        }
        else if(formula.equalsIgnoreCase("PERIMETER RECTANGLE")) {
            print("Enter length: ");
            int l = input.nextInt();
            print("Enter width: ");
            int w = input.nextInt();
            println("Result: " + per_rec(l,w));
        }
        else if(formula.equalsIgnoreCase("AREA SQUARE")) {
            print("Enter side: ");
            int s = input.nextInt();
            println("Result: " + area_sq(s));
        }
        else if(formula.equalsIgnoreCase("AREA RECTANGLE")) {
            print("Enter length: ");
            int l = input.nextInt();
            print("Enter width: ");
            int w = input.nextInt();
           println("Result: " + area_rec(l,w));
        }
        else if(formula.equalsIgnoreCase("AREA TRIANGLE")) {
            print("Enter base: ");
            int b = input.nextInt();
            print("Enter height: ");
            int h = input.nextInt();
           println("Result: " + area_tri(b,h));
        }
        

       
    }
}