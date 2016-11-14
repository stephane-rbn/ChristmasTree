public class ChristmasTree {

    public static int getRandomNumber(){
        return (int)Math.round(Math.random());
    }

    public static void build(int number) {

        for (int i = 0; i < number; i++){

            for (int j = 1; j < number-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2*(i)+1); k++) {
                System.out.print((getRandomNumber() > 0.5 ? "*":"★"));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        build(5);
    }
}
