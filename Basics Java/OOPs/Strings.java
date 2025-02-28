public class Strings {

    static void change(String str [], String s1) {
               
                str[0] = "Binod";

                s1 = "Vinod";
    
        }
    
        public static void main(String args []) {
    
            String str []= {"Shubham"};

            String str1 = "Shubham";
    
            change(str, str1);

            System.out.println(str[0]);

            System.out.println(str1);


    }
}
