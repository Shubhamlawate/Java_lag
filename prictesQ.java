

import java.util.*;

public class prictesQ {

    //Quation avarge number
//    public static int avrg(int a,int b,int c){
//        return (a+b+c)/3;
//    }
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//        int c =sc.nextInt();
//        System.out.println("Avarge of three number :"+ avrg(a,b,c));
//
//    }


    //odd number sum 1 to n
//    public static int oddsum(int n){
//
//        int sum = 0;
//        for(int i =n;i>=0;i--){
//            if(i%2!=0) {
//                sum = sum + i;
//            }
//        }
//        return sum;
//    }
//
//    public static void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        System.out.println(" sum of odd number {n}:"+oddsum(n));
//    }

    //gerter number return

//    public static int greterN(int a,int b ){
//
//        int z= 0;
//        if (a>b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//        return  b;
//    }
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int greter =greterN(a,b);
//        System.out.println(" greter number return :"+greter );
//    }




    // find the redius  crecumfirence oc circle

//    static double circumfirence(double redies){
//
//        return 2*Math.PI*redies;
//    }
//    public static  void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        System.out.println(circumfirence(5) );
//    }

//  public static int vote(int age){
//      if(age>=18){
//          System.out.println("eligible to voting");
//      }else{
//          System.out.println("not eligible to voting");
//      }
//    return age;
//  }
//
//
// public static void main(String[] args){
//     Scanner sc =new Scanner(System.in);
//     int age = sc.nextInt();
//     int v = vote(age);
//     System.out.println(v);
//
// }

//public static void main(String[] args){
//
//    int i =1;
//    do{
//        System.out.println("  *");
//    }while (i>=1);
//}


//    public static void main(String[] aegs){
//
//        Scanner sc =  new Scanner(System.in);
//        int num;
//        int positive =0,nigetive =0 ,zero= 0;
//        char chioce;
//
//        do{
//
//
//            System.out.println("Enter the  num :");
//            num = sc.nextInt();
//
//            if(num>0)
//                positive++;
//            else if(num<0)
//                nigetive++;
//            else
//                zero++;
//
//            System.out.println(" we you want enter another number (y/n) :");
//            chioce = sc.next().charAt(0);
//        }while (chioce == 'y' || chioce == 'Y');
//
//        System.out.println(" \n Reselt");
//        System.out.println(" positive count :"+ positive);
//        System.out.println(" nigetive count :"+ nigetive);
//        System.out.println(" zero count :"+ zero);
//
//        sc.close();
//    }




//
//    static long power(int x ,int n){
//        int result = 1;
//
//        for(int i =1; i<=n ; i++){
//
//            result =result*x;
//        }
//        return result;
//    }
//
//    public  static  void    main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the x :");
//        int x =sc.nextInt();
//        System.out.print("Enter number n :");
//        int n= sc.nextInt();
//
//        System.out.println(x +"^"+n +"=" +power(x,n));
//        sc.close();
//    }







//    static  int GDC(int a,int b){
//        while (b!=0){
//            int temp =b;
//            b =a %b;
//            a =temp;
//        }
//        return a;
//    }
//
//
//    public  static  void main(String[] args){
//        Scanner  sc = new Scanner(System.in);
//
//        System.out.print("Enter number a :");
//        int a =sc.nextInt();
//
//        System.out.print("Enter number b :");
//        int b = sc.nextInt();
//
//        System.out.println("RDC "+ GDC(a,b));
//
//        sc.close();
//    }





        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();

            int a = 0, b = 1, c;

            System.out.print("Fibonacci Series: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");

                c = a + b;
                a = b;
                b = c;
            }

            sc.close();
        }





}
