public class BMExercio07 {
    public static void main(String[] args) {

        int x = 13;
        int y = 2;

        while(y > 1) {

            if (x % 2 == 0) {
                y = x / 2;
            }
            
            if (x % 2 != 0) {
                y = 3 * x + 1;
            }

            System.out.println(x);
            x = y;
        }

        System.out.println(x);
    }
}
