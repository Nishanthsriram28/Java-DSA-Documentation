  double R ; //input
        double $ = 84.36; //process
        double result ; //output
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rupees to Convert to Dollars: ");
        R = sc.nextDouble();
        result=(R%$);
        if(result == 0){
            // System.out.println(R/$+" dollars");
            System.out.println(R/$);  
        }else{
            // System.out.println(R/$+" dollars");
            System.out.println(R/$);  
        }
