public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if(number >= 5) {
            // rows
            for(int i = 0; i < number; i++) {
                String pattern = "";

                // columns
                for(int j = 0; j < number; j++) {
                    if(j == 0 || j == number - 1 || i == 0 || i == number - 1) {
                        pattern += "*";
                    } else if(j == i) {
                        pattern += "*";
                    } else if (j == (number - i - 1)) {
                        pattern += "*";
                    } else {
                        pattern += " ";
                    }
                }
                System.out.println(pattern);
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
