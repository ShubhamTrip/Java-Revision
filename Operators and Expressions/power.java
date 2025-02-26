import java.util.Scanner;

class Power{
    public static void main(String [] args) {
     
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();

        int ans = 1;

        s.close();

        while(n > 0){

            ans *= x;
            n--;
        }
        
        System.out.println(ans);

    }

}