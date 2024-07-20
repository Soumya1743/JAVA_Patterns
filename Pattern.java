package Patterns_JAVA;
//public class Pattern {
//    public static void main(String[] args){
//        int n=1;
//        for(int i=1; i<=4; i++)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(n + "  ");
//                n++;
//            }
//            System.out.println();
//        }
//    }
//}

//public class Pattern {
//    public static void main(String[] args){
//        for(int i=4; i>=1; i--)
//        {
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(i + "  ");
//            }
//
//            for(int k=4; k>=i; k--)
//            {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

public class Pattern {
    public static void main(String[] args){
        for(int i=1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(i);
            }

            for(int k=4; k>=i; k--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
