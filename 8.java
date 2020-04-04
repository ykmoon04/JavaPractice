import java.util.Scanner;

public class Main {
    static int getDiscount(int product, int cost){

        if(product>=0 && product<4)
            return (int)(cost*0.9);
        else if(product>=4 && product <8)
            return (int)(cost*0.8);
        else if(product >= 8 && product <= 10)
            return (int)(cost*0.7);
        else
            return (int)(cost * 0.95);
    }

    static int usePoint(int afterDiscount, int point){
        if(point <= afterDiscount*0.5)
            return afterDiscount-point;
        else
            return (int)(afterDiscount*0.5);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("상품코드와, 결제금액, 적립금을 순서대로 입력하세요 : ");
        int product = sc.nextInt();
        int cost = sc.nextInt();
        int point = sc.nextInt();

        int afterDiscount = getDiscount(product, cost);
        System.out.println("최종 결제 금액은 "+ usePoint(afterDiscount,point)+"원 입니다.");
    }
}
