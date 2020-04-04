public class Main {


    static void Transpose (int[][] arr){
        int temp = 0;
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                if(i < j){
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] arr = {{2,4,6},{8,10,12},{14,16,18}};
        Transpose(arr);
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                    System.out.printf("%3d ",arr[i][j]);
                }
            System.out.println();
            }
        }
}
