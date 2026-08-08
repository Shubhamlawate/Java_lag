import java.util.*;



public class arrays_allconcept {

    //1. Traversal
//    public static void main(String[] args){
//        int[] arr ={10,20,30,40,50,60,70,80,90};
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"  ");
//
//        }
//    }


//2. Insertion

    public static void main(String[] args){

        Scanner sc  =new Scanner(System.in);

        int []arr =new int[10];
        System.out.print("Enter the number n:");
        int n =sc.nextInt();

        for(int i =0 ;i <n; i++){
           arr[i] =sc.nextInt();
        }

        System.out.print("Entter the element :");
        int element = sc.nextInt();

        System.out.print("Enter the position :");
        int pos =sc.nextInt();
//creat the space for element
        for(int i = n; i>= pos;i--){
            arr[i] =arr[i- 1];
        }
      // insert
        arr[pos-1] =element;

        n++;
        for(int i =0;i<n;i++){
            System.out.print( arr[i]+"  " );

        }
        sc.close();
    }
}
