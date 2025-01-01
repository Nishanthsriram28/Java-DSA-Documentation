public class patterns {
    public static void main(String[] args) {
        
        //printing single table
        int i=10;
        int j;
        while(true){
        for(j=1;j<=10;j++){
            System.out.println(i+"*"+j+"="+i*j);
            
        }
        System.out.println();
        break;
        }
        
        //printing multiple tables
        for(int a=1;a<=10;a++){
            for(int b=1;b<=10;b++){
                System.out.println(a+"*"+b+"="+a*b);
            }
        }

    }
}
