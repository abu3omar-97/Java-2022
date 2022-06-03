package Week10;

public class Main {

    static int getSum(int num){
        int sum = 0;
        for (int i = 1; i <= num  ; i++) {
            sum += i;
        }
        return sum;
    }
 // System.out.println(f1(3));

    static int f1(int a){ return f2(a) +2; }

    static int f2(int a){
        int b = a++;
        return f3(a,1) + b;
    }

    static int f3(int a,int b){ return f1(a) * 2; }


    public static void main(String[] args) {
        System.out.println(f1(3));

    }

}
