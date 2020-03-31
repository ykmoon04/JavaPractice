import java.util.Scanner;

public class main4 {
    public static void main (String[] args){
        int[] arr = new int[50];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 50; i++){
            arr[i] = 2 * i + 1;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
