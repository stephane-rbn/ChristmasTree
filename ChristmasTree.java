public class ChristmasTree {

    public static void build(int number) {

        for (int i = 0; i < number; i++){

            for (int j = 0; j < number-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2*(i)+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        build(5);
    }
}
