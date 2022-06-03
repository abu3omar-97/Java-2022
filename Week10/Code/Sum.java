package Week10;

public class Sum {

    // 2 - N (RECURSION)
    static int getSumRecursive(int num){
        if(num == 1) return 1; // BASE CASE
        return num + getSumRecursive(num-1); // RECURSIVE CALL
    }

    static int getFactorialRecursive(int num){
        return num == 1 ? num : num * getSumRecursive(num-1);
    }

    // n! = n * n-1 * n-2 * n-3 ... * 1
    // 4! = 4 * 3 * 2 * 1
    // n! = n * (n-1)!

    // 1 2 2 7 16 44 113 298 . . . .
    // Xn = (Xn-1+Xn-2)* 2 – Xn-3 for n >3 and X1 =1 ,X2 =2, X3 =2

    static long sequence(int n){
        if(n == 1) return 1;
        if(n == 2 || n == 3) return 2;
        return (sequence(n-1) + sequence(n-2)) * 2 - sequence(n-3);
    }

    static int getBounces(double height){
        if(height <= 0.02) return 0;
        return 1 + getBounces(height * 0.7);
    }

    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.print( sequence(i));
//            System.out.print(", ");
//        }

        System.out.println(getBounces(5));

    }



}
