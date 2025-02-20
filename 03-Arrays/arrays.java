import java.util.*;

public class arrays {

    // returning the given array
    public static void array(){
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 Integers into array : ");
    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    arr[2] = sc.nextInt();
    arr[3] = sc.nextInt();
    arr[4] = sc.nextInt();
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
    }
    }

    // average printing
    public static void average(){
    int arr[] = {90,85,66,75,88};
    int sum = 0;
    for(int i=0;i<arr.length;i++){
    sum += arr[i];
    }
    int average = sum/arr.length;
    System.out.println(average);
    }

    // passing arrays as arguments
    public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
    marks[i] = marks[i]+1;
    }
    }
    public static void main(String[] args){
    int marks[] = {1,2,3};
    update(marks);
    for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]+" ");
    }
    }

    // swap two numbers (passing array as argument)
    public static void swap(int arr[]){
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    }
    public static void main(String[] args){
    int arr[] = {1,50};
    swap(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    }

    // Linear Search
    public static int linear_search(int key){
    int arr[] = {2,4,5,7,6,9,10,12,44};
    for(int i=0;i<arr.length;i++){
    if(key==arr[i]){
    return i;
    }
    }
    return -1;
    }
    public static void main(String[] args){
    int value = linear_search(44);
    if(value==-1){
    System.out.println("Key Not Found");
    }else{
    System.out.println("Key Found on "+value+ " index");
    }
    }

    // Linear Search (Food Menu)
    public static String linear_Search(String key) {
    String arr[] = { "frenchfries", "samosa", "chickenPuffs", "chickenRolls",
    "coolDrinks" };
    for (int i = 0; i < arr.length; i++) {
    if (key == arr[i]) {
    System.out.println(key + " is on " + i + " index");
    }
    }
    return "Not Found";
    }
    public static void main(String[] args) {
    System.out.println(linear_Search("coolDrinks"));
    }

    // Largest number in an array(Static)
    public static void large_number() {
        int arr[] = { 23, 2, 3, 100, 2, 22 };
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Largest number in this array is " + min);
    }
    public static void main(String[] args) {
        large_number();
    }

    // Largest number in an array(Dynamic)
    public static void large_number(int arr[]){
    int min = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
    if(min<arr[i]){
    min = arr[i];
    }
    }
    System.out.println("Largest Number is "+min);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 5 Integers ");
    int arr[] = new int[5];
    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    arr[2] = sc.nextInt();
    arr[3] = sc.nextInt();
    arr[4] = sc.nextInt();
    large_number(arr);
    }

    // Binary Search
    public static int binary_search(int arr[],int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start + end) /2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,66,77};
        int key = 77;
        System.out.print(binary_search(arr,key));
    }

    // Revesering An array
    public static void reverse_array(int arr[]){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start += 1;
    end -= 1;
    }
    }
    public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.print("Before Swap :");
    for(int i=0;i<arr.length;i++){
    System.out.print(+arr[i]+" ");
    }
    System.out.println();
    reverse_array(arr);
    System.out.print("After Swap :");
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    }

    // Pairs in Arrays
    public static void pairs(int arr[]){
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
    System.out.print("("+arr[i]+","+arr[j]+")");
    }
    System.out.println();
    }
    }
    public static void main(String[] args){
    int arr[] = {2,4,6,8,10};
    pairs(arr);
    }

    // Simple Sub Arrays
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        subarray(arr);
    }
    public static void subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }

  // Brute Force sub arrays
    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int sum = 0;
                for (int k = i; k <= i + j; k++) {
                    sum += arr[k];
                    if (max < sum) {
                        max = sum;
                    }
                    if (min > sum) {
                        min = sum;
                    }
                    System.out.println(sum);
                }
               System.out.println();
            }       
        } 
        System.out.println("Maximum sub array is " + max);
        System.out.println("Minimum sub array is " + min);
    }

    //Prefix Sum of an array
   public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cursum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("Highest sum is " + maxsum);
    }
    

    //Kadanes Algorithm ( with special case all-negatives )
     public static void main(String[] args) {
        int arr[] = {4, 3, -10, 3 ,-1, 2 ,0, -3 ,5 ,7 ,-4, -8 ,-10 ,4, 4, 7};
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            flag = arr[i]<0;
        }
        if(flag == true){
            all_negatives(arr);
        }else{
            kadanes(arr);
        }
    }
    public static void kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("maximum sub array is :"+ms);
    }
    public static void all_negatives(int arr[]){
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ms){
                ms = arr[i];
            }
        }
        System.out.println("maximum sub array is :"+ms);
    }
    

    


}
