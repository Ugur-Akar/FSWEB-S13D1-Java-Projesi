import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(shouldWakeUp(false, 7));
        System.out.println(hasTeen(1,2,13));
        System.out.println(isCatPlaying(true,35));

        System.out.print("enter dim1:");
        double dim1 = scanner.nextDouble();
        System.out.print("enter dim2:");
        double dim2 = scanner.nextDouble();

        System.out.println(area(dim1, dim2));

        System.out.print("Enter r:");
        double r = scanner.nextDouble();

        System.out.println(area(r));


    }

    static boolean shouldWakeUp(boolean isBarking, int hour){
        if(isBarking && ((hour >= 0 && hour < 8) || (hour > 20 && hour <= 23))){
            return true;
        }

        return false;
    }

    static boolean hasTeen(int a, int b, int c){
        int[] arr = {a,b,c};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 13 && arr[i] <= 19){
                return true;
            }
        }

        return false;
    }

    static boolean isCatPlaying(boolean isSummer, int temp){
        if(temp >= 25 && ((isSummer && temp <= 45) || (!isSummer && temp <= 35)))
            return true;
        return false;
    }

    static double area(double dim1, double dim2){
        if(dim1 >= 0 && dim2 >= 0)
            return dim1*dim2;
        return -1;
    }

    static double area(double radius){
        if(radius >= 0)
            return Math.PI*Math.pow(radius,2);
        return -1;
    }
}