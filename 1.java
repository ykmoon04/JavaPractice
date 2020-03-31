import java.util.Scanner;

public class assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 두 개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("덧셈: ");
        System.out.println(a + b);
        System.out.print("뺄셈: ");
        System.out.println(a - b);
        System.out.print("곱셈: ");
        System.out.println(a * b);
        System.out.print("나눗셈: ");
        System.out.println(a / b);

        sc.close();
    }
}
