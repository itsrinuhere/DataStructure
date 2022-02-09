import java.util.Scanner;
class Main{
    static protected Scanner sc;
    static protected Main obj ;
    Main(){
        //empty constructor
        
    }
    int binarySearch(int[] array,int key){
        int start =0,end = array.length,mid=0;
        while(key!=mid){
            mid = start + end/2;
            if(key>array[mid])
                mid++;
            else if(key<array[mid])
                mid--;        
        }
        if (key == array[mid])
            return mid;
        else     
            return -1;
    }
    void print(int[] arr){
        for(int i :arr)
                System.out.print(i+"\t");
    }
    int input(){
        return sc.nextInt();
    }
    int[] input(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
            arr[i]= sc.nextInt();
    return arr;        
    }
    void print(int input){
        System.out.print(input);
    }
    void print(String input){
        System.out.print(input);
    }
    void print(char[] arr){
        System.out.println("Enter an array");
        for(int i :arr)
                System.out.print(i+"\t");
    }
    public static void main(String[] arg){
       //auto code computed in constructor
       obj= new Main();
       try{
        sc = new Scanner(System.in);
        obj.print("Please Enter Size of an array:\t");
        int size = sc.nextInt();
        obj.print("Enter a key value:\t");
        int key = obj.input();
        obj.print("please enter the array:\t");
        int n =obj.binarySearch(obj.input(size),key);
        if( n!=-1)
            obj.print("Array is at"+n);
        else
            obj.print("\nNot found");    
        sc.close();
   }catch(Exception ex){
      System.out.print(ex);
   }
    }
}