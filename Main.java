import java.util.Scanner;
class Main{
    static protected Scanner sc;
    static protected Main obj ;
    Main(){
        //empty constructor
        
    }
    int binarySearch(){
        return 0;
    }
    void print(int[] arr){
        for(int i :arr)
                System.out.print(i+"\t");
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
        System.out.println("Please Enter Size of an array");
        int size = sc.nextInt();
        int[] array = obj.input(size);

        obj.print(array);
        sc.close();
   }catch(Exception ex){
      System.out.print(ex);
   }
    }
}