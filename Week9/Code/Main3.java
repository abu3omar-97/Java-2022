package Week9;

public class Main3 {
    public static void main(String[] args) {
        // PRINT FIRST 10 PRIME NUMBERS
//        printFirstNPrimes(20);

//        for (int i = 4; i <= 6; i++) {
//            System.out.println(getFactorial(i));
//        }


        getGreetingBasedOnGender("M");

        // HELLO SIR
        // HELLO MADAM

    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void printFirstNPrimes(int n){
        int counter = 0;
        int i = 2;
        while(counter < n){
            if(isPrime(i)) {
                System.out.println(i);
                counter++;
            }
            i++;
        }

    }

    public static int getFactorial(int num){
        int result = 1;
        for (int i = 1; i <= num ; i++) {
            result = result * i;
        }
        return result;
    }

    public static boolean isLegal(int age){
        return age >= 18;
    }

    public static String getGreetingBasedOnGender(String gender){
        return gender.equalsIgnoreCase("M") ? "HELLO SIR" : "HELLO MADAM";
    }

}
