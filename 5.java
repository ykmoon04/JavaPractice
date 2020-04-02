public class main5 {
    public  static  void main(String[] args){
        int current = 1;
        while(current < 108){
            if (current % 50 == 0) System.out.println(current + "번째 계단이다!");
            current++;
        }
        System.out.println("다왔다!");
    }
}
