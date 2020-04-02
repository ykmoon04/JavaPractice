import java.util.Scanner;

public class main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();

        if(size < 10){
            System.out.println("배열의 크기는 10보다 커야합니다");
            return;
        }

        int sum = 0;
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            if(i % 2 == 0) arr[i] = 1;
            else arr[i] = 2;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
