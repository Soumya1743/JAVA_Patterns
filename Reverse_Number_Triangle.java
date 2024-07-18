public class Reverse_Number_Triangle {
    public static void main(String[] args) {
        int rows = 4;

        for(int i=4; i>=rows; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
