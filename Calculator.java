public class Calculator {
    int add(int first, int sec){
        return first + sec;
    }

    void add(String first, String sec){
        String result = "";
        int i = 0;
        if(first.length() > sec.length()){
            String temp = first;
            first = sec;
            sec = temp;
        }

        for(;i < first.length();i++){
            result = result + first.charAt(i) + sec.charAt(i);
        }
        result += sec.substring(i,sec.length());

        System.out.println(result);
    }

    int minus(int first, int sec){
        return first - sec;
    }

    void minus(String first, String sec){
        int len = first.length();

        for(String f: first.split("")){

            if(sec.contains(f)){
                first = first.replace(String.valueOf(f),"");
                sec = sec.replace(String.valueOf(f),"");
            }
        }
        System.out.println(first + sec);
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(10,20));
        cal.add("hello","computer");
        System.out.println(cal.minus(10,20));
        cal.minus("hello","world");
    }
}
