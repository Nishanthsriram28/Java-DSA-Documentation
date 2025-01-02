import java.util.*;

public class KKfunctions {

    // Methods Specifying Maximum and Minimum
    public static void main(String[] args) {
    int first;
    int second;
    int third;
    Scanner sc = new Scanner(System.in);
    first = sc.nextInt();
    second = sc.nextInt();
    third = sc.nextInt();
    System.out.println(Maximum(first,second,third));
    System.out.println(Minimum(first,second,third));
    }
    public static String Maximum(int a, int b, int c) {
    return (a > b && a > c) ? a + " Is Maximum"
    : (b > a && b > c) ? b + " Is Maximum"
    : (c > a && c > b) ? c + " Is Maximum"
    : (a == b || a == c || b == c || b == a) ? "Equal numbers are not allowed"
    : "Wrong input";
    }
    public static String Minimum(int a, int b, int c) {
    return (a < b && a < c) ? a + " Is Minimum"
    : (b < a && b < c) ? b + " Is Minimum"
    : (c < a && c < b) ? c + " Is Minimum"
    : (a == b || a == c || b == c || b == a) ? "Equal numbers are not allowed"
    : "Wrong input";
    }

    // Voting Eligibility
    public static void main(String[] args) {
    System.out.println(voting());
    }
    public static String voting() {
    int age;
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    return (age >= 18) ? "You are Eligible To Vote"
    : (age < 18) ? "You are Not Eligible To Vote" : "Wrong Input";
    }

    // Sum of 2 Numbers
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(sum(a,b));
    }
    public static int sum(int a, int b) {
        return a+b;
    }

    // Curcumference and Area of Circle
    public static void main(String[] args){
        int radius;
        Scanner sc= new Scanner(System.in);
        radius=sc.nextInt();
        System.out.println("Area of Circle "+circle1(radius));
        System.out.println("circumstance of circle "+circle2(radius));
    }
    public static double circle1(int a){
        return 2.14*a*a;
    }
    public static double circle2(int b){
        return  2*2.14*b;
    }

    // 

}

