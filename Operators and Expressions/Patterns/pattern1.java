import java.util.Scanner;

class Pattern {
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);

        int input = s.nextInt();

        s.close();

        int i = 0;
        while(i < input) {

            int j = input - i;
            
            while(j <= input) {

                char ch = (char) ('A' + j -1);

                System.out.print(ch);
                j++;

            }

            System.out.println();

            i++;
        }


    }
}