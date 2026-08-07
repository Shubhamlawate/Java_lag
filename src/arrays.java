
import java.util.*;
public class arrays {
//    public static void main(String[] args){

//        int marks[] = new int[3];
//        int marks[] = {98,99,100 };
//
//        for(int i =0;i<3;i++){
//            System.out.print(marks[i]+" ");
//        }
//
//    Scanner  sc = new Scanner(System.in);
//        System.out.print("Enter size of Array :");
//    int size =sc.nextInt();
//
//    int marks[] =new int [size];
////        int[] marks ={size};
//
//
//        for(int i =0;i<size;i++){
//            marks[i] =sc.nextInt();
//        }
//
//    for(int i =0; i< size; i++){
//
//
//       System.out.print(marks[i]+"  ");
//
//    }
//
//
//    sc.close();
//    }



    // TAKE INPUT USERS AND THAT ARRAY SERCH X NUMBER AND ORINT INDEX

//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int size =sc.nextInt();
//
//        int ages [] =new int[size];
//
//        for (int i= 0;i<size;i++){
//            ages[i]=sc.nextInt();
//        }
//        System.out.print("Enter the x :");
//        int x =sc.nextInt();
//        for(int i=0;i<ages.length;i++){
//
//            if(ages[i]==x){
//                System.out.println("index of x:"+i);
//            }
//
//        }
//
//        for(int i=0;i<size;i++){
//            System.out.print(ages[i]+"  ");
//        }
//    }


    //Binary algorithem
     static int binarysearch(int[] arr,int target){
         int low =0;
         int high=arr.length;
         while (low<=high){
             int mid =low +(high-low)/2;
             if(arr[mid]==target){
                 return mid;
             }
             if(target<arr[mid]){
                 high=mid-1;
             }else {
                 low=mid+1;
             }
         }
         return -1;
     }

     public static void main(String[] args){
         int[]arr={10,20,30,40,50,60,70};
         int target=50;
        int serach= binarysearch(arr,target);
         if(serach!=-1){
             System.out.println(serach);

         }else {
             System.out.println("not found");
         }
     }

}
