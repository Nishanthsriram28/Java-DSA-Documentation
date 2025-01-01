import java.util.Scanner;
public class functions {

    // AVG of 3 NUMS
    public static void avg(){
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int avg = (a+b+c)/3;
    System.out.println(avg);
    }
    public static void main(String[] args) {
    avg();
    }

    // Even Odd
    public static boolean isEven(int a) {
    return a % 2 == 0;
    }
    public static void main(String args[]) {
    int a = 66;
    if (isEven(a))
    System.out.println(true);
    else
    System.out.println(false);
    }

    // Palindrome
    public static int Palindrome(int original) {
    int duplicate = original;
    int lastdigit = 0;
    int reversed = 0;
    while (duplicate > 0) {
    lastdigit = duplicate % 10;
    duplicate = duplicate / 10;
    reversed = reversed * 10 + lastdigit;
    }
    if(original == reversed){
    System.out.println("its a palindrome");
    }else{
    System.out.println("its not a palindrome");
    }
    return reversed;
    }
    public static void main(String[] args) {
    Palindrome(88588);
    }

    // Sum of Digits of Integers
    public static int SumofInt(int number) {
        int absolute = Math.abs(number);//If we provide positive or negative value as argument, this method will result positive value.
        int lastdigit;
        int added = 0;
        while (absolute > 0) {
            lastdigit = absolute % 10;
            absolute /= 10;
            added += lastdigit;
        }
        return added;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(SumofInt(n));
    }
}
