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

    // Sub Arrays
    public static void sub_array(int arr[]) {
        int ts = 0;
        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println("sum is "+sum);
                ts++;
                System.out.println();
                if(sum<minsum){
                    minsum = sum;
                }
                if(sum>maxsum){
                    maxsum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("total sub arrays "+ts);
        System.out.println("Max Sum in Sub array is "+maxsum);
        System.out.println("Min Sum in Sub array is "+minsum);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        sub_array(arr);
    }


    


}
