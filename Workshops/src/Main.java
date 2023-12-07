public class Main {

    public static void printHallowPattern(int rows, int columns) {

        for (int i = 0; i < rows; i++) {

            if (i == 0 || i == rows - 1) {
                for (int j = 0; j < columns; j++) {
                    System.out.print('*');
                }
            } else {
                System.out.print('*');
                for (int j = 1; j < columns - 1; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHallowPattern(10, 30);
    }
}