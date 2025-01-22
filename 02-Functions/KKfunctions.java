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

     // Prime or Not
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        primen(n);
        if (primen(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Nubmer");
        }
    }
    public static boolean primen(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    // Factorial
    public static void main(String args[]) {
    int number=10;
    System.out.println(factorial(number));
    }
    public static int factorial(int a){
    int counter=1;
    for(int i=1;i<=a;i++){
    counter*=i;
    }
    return counter;
    }

    // palindrome Number
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println(palindrome(input));
    }
    public static boolean palindrome(int n){
    int original = n;
    int duplicalte=original;
    int lastdigit =0;
    int reverse=0;
    while(duplicalte>0){
    lastdigit = duplicalte % 10;
    duplicalte = duplicalte / 10;
    reverse = reverse * 10 + lastdigit;
    }
    System.out.println("reversed = "+reverse);
    return n == reverse;
    }

    // Pythogorian Triplet ( without knowing things)
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    if(pytha(input)){
    System.out.println("its a pythagorean triplet ");
    }else{
    System.out.println("not a pythagorean triplet");
    }
    }
    public static boolean pytha(int n){
    int original = n;
    int duplicalte = original;
    int lastsquared = 0;
    int firstsquared = 0;
    while (duplicalte > 0) {
         // last number
    int lastdigit = duplicalte % 10;
    lastdigit *= lastdigit;
    lastsquared = lastdigit;
    duplicalte = duplicalte / 10;
    break;
    }
    System.out.println(lastsquared);
    while (duplicalte > 0) {
         // first & second numbers
    int sec_fir_digit = duplicalte % 10;
    sec_fir_digit *= sec_fir_digit;
    firstsquared += sec_fir_digit;
    duplicalte = duplicalte / 10;
    }
    System.out.println(firstsquared);
    return original == (lastsquared + firstsquared);
    }

    // Pythogorian Triplet ( with knowing things)
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(pytha(a,b,c)){
    System.out.println("pytha triplet");
    }else{
    System.out.println("not a pytha triplet");
    }
    }
    public static boolean pytha(int a, int b, int c){
    int asquared = a*a;
    int bsquared = b*b;
    int csquared = c*c;
    return (asquared + bsquared == csquared || asquared + csquared == bsquared ||
    bsquared + csquared == asquared );
    }

    // primes b/w numbers
    not yet completed

    // sum of n natural numbers
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n)); 
    }
    public static int sum(int n){
        int j=0;
        for(int i=1;i<=n;i++){
            j += i;
        }
        return j;
    }
    
    //Armstrong Number Only for 3 Digits
        public static void main(String [] args){
               if(Armstrong(153)){
                System.out.println("its an armstrong Number");
               }else{
                System.out.println("Not an armstrong Number");
               }
        }
        public static boolean Armstrong(int n){
                int cubed = 0;
                int duplicate = n;
                while (duplicate>0) {
                        int lastdigit = duplicate % 10;
                        lastdigit = lastdigit*lastdigit*lastdigit;
                        cubed += lastdigit;
                        duplicate = duplicate / 10;  
                }
                return cubed==n;
        }

        // 8.Triangle
        public static void main(String[] args) {
                triangle(5);
        }
        public static void triangle(int n) {
                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }

    
     //Inverted Triangle
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=11-2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


      // Spaced Inverted Triangle
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            for(int k=0;k<=i-1;k++){
                System.out.print(" ");
            }
        }
    }

    
  

}

