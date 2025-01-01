import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int x;
        int y;
        int d;

        Scanner obj = new Scanner(System.in);
        x=obj.nextInt();
        System.out.println("\n");
        System.out.println(a+"\n"+b+"\n"+c);
        for(y=4;y<=x;y++){
            d=c+b;
            b=c;
            c=d;
            System.out.println(d);
        }

    }
}
