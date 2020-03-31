import java.util.Scanner;

public class assignment02 {
    public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("두 사람의 나이를 입력하세요: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(Math.abs(a-b)==12)
        System.out.println("띠동갑입니다!");
    else
        System.out.println("띠동갑이 아닙니다!");
    }
}
