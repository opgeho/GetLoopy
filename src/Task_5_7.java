public class Task_5_7 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= row; col++){
                System.out.print ("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int row = 5; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print ("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print ("* ");
            }
            System.out.println("");
        }
    }
}
