//code works inside main/top/filename class

//TRAPPING RAIN WATER
public static int TotalTrappedWater(int arr[]){
        //Leftmax boundary
        int leftmax[] = new int[arr.length];
        int n=arr.length;
        int trappedwater = 0;
        leftmax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1]);
        }
        //Rightmax boundary
        int rightmax[] = new int[arr.length];
        rightmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        //loop finding water level
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            //trapped water
            trappedwater += waterlevel-arr[i];
        }
        return trappedwater;
    }
  
    public static void main(String[]args){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(TotalTrappedWater(arr));

    }


// Buy & Sell Stock
    public static int buysell(int arr[]){
        int maxprofit=0, bestbuy = arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>bestbuy){
                maxprofit = Math.max(maxprofit,arr[i]-bestbuy);
            }
            bestbuy = Math.min(bestbuy,arr[i]);
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(buysell(arr));
    }

