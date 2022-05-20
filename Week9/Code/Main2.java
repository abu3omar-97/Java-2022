package Week9;

public class Main2 {

    public static void main(String[] args) {
//        System.out.println(isBagValid(10,1,2,20));

//        System.out.println(absoluteValue(9));

        // 10 - 20
        // 55 - 100
        // 150 - 299


    }

    public static boolean isBagValid(int width, int height, int depth, int weight){
        return width <= 40 && height <= 55 && depth <= 20 && weight <= 23;
    }

    public static boolean isBagWeightValid(int weight){
        return isBagValid(0,0,0,weight);
    }

    static int absoluteValue(int num){
        return num < 0 ? num * -1 : num;
    }


    public static int f(int x, int y){
            return 5/y + x;
    }

    public static void printInRange(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }


}
