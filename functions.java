
import java.util.*;


public class functions {

//    public static  void namereturn(String name){
//        System.out.println(name);
//        return;
//
//    }
//
//
//    public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//
//      String name =sc.next();
//
//      namereturn("Your name :"+name);
//
//    }





//    public static int Sumtwo(int a,int b){
//
//        return a+b;
//    }
//
//    public static void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//
//        System.out.println(" Sum of two  numbers :"+Sumtwo(a,b));
//    }






    public static int factoreal(int n){

        int fc =1;
        for(int i =n;i>=1;i--){
           fc =fc* i;
        }

        return fc;

    }

    public static void  main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int fc = factoreal(n);
        System.out.println("Factoreal  [n] :"+fc );

    }
}

