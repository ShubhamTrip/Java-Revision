
/* Note
 What is static and non static used for ?

 Ans. Static variables are global variables whereas non static vairables have limited scope.

 Non Static are of two types 1. Instance 2. Local

 Suppose you have a Bakery Business wherein you sell two classfication of products let say:
 1. Freshly prepared  2. Packaged

 Taking 1. for example:

 Here you want to mentain your Bakery shop name as your signature with every Freshly Prepared product.

*/
 class FreshlyPrepared {

    static String aProductOf = "Classic Bakers";
    static int GSTIN = 45096;

    int noOfCakes = 10;
  //Now aProductOf ad GSTIN will only have one and only one copy.

    public static void main(String args[]){
   /* 
    System.out.println(aProductOf);  // This will work since aProductOf is a Globle or static variable.

    System.out.println(noOfCakes);  // This will not work since noOfCakes is a instance variable.
    */
    }

    void chocoCake() {
    
        
        System.out.println("THis is a chocoCake");
    }

    void whiteCake() {
    
        System.out.println("THis is a whiteCake");
    }
    
 }

 




public class basic1datatype {
   
}
