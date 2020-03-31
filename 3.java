import java.util.Scanner;

public class assignment03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름을 입력하세요: ");
        int rad = sc.nextInt();
        double pi = 3.14;
        System.out.println("정원의 둘레는: " + String.format("%.1f",2*pi*rad));
        System.out.println("정원의 넓이는: " + String.format("%.1f",pi*rad*rad));
    }

}
