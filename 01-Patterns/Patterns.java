public class patterns {
    public static void main(String[] args){

        //Square Pattern
         int n=5;
         for(int line=1;line<=n;line++){
             for(int column=1;column<=n;column++){
                 System.out.print("*");
             }
             System.out.println();
         }

        // Star Pattern (Bottom left Triangle)
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                if(row-col >= 0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Top Right Triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j<=0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Top Left Triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j<=6){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Bottom Right Triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i-j==0 || i+j==6){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }

        // Floyd's Triangle
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }

        


    }
}
