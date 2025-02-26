import java.util.Scanner;

class Conditionals {
  
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        
        int basic = s.nextInt();
        char grade = s.next().charAt(0);

        double hra = 0.20 * basic;

        double da = 0.50 * basic;

        double pf = .11 * basic;

        int allowance;

        if(grade == 'A'){
            allowance = 1700;
        } 
        else if(grade == 'B') {
            allowance = 1500;
        }
        else {
            allowance = 1300;
        }

        double totalSalary  = basic + hra + da + allowance - pf;

        System.out.println("The total salary is " + totalSalary);

    }


}