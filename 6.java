import java.util.Scanner;

public class main6 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String loc = sc.next();

        switch (loc){
            case "명진관":
                System.out.println("15분이 소요됩니다.");
                break;
            case "신공학관":
                System.out.println("10분이 소요됩니다.");
                break;
            case "사회과학관":
                System.out.println("22분이 소요됩니다.");
                break;
            case "상록원":
                System.out.println("17분이 소요됩니다.");
                break;
            case "학림관":
                System.out.println("12분이 소요됩니다.");
                break;
            default:
                System.out.println("잘못된 데이터입니다");
                break;
        }

    }
}
