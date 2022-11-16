import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner dat= new Scanner(System.in);
        System.out.print("Enter a number= ");//get the end of the number from user
        int num = dat.nextInt();
        double res=0;//it must be double for diveded
        for (double i = 1; i <=num ; i++) {//double because of divide...
            res+=(1/i);
                    }
        System.out.println("Result of Harmonic = " + res);

    }
}
