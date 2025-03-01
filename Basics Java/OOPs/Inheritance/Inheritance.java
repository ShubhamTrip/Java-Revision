
class Rectangle {
   
    int length, width;

    Rectangle() {
        System.out.println("Rect constructor called");
    }

    Rectangle(int l, int b) {

        length = l;
        width = b;

        System.out.println("Rect Para const called");
    }
}

class Cubiod extends Rectangle {

    int height;

    Cubiod(int length, int width, int h) {
        super(length, width);
        height = h;
    }
    
    int volume() {
            return super.length * super.width * height;
        }
}

public class Inheritance {

    public static void main(String args []){
         
        Cubiod c1 = new Cubiod(20,30,10);

        System.out.println(c1.volume());

    }

}