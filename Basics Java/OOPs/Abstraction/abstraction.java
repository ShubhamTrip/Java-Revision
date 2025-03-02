
abstract class Super {

    int detele() {

        System.out.println("Delete called");

        return 0; 
    }

    // If only one function is abstract, then the class must be abstract

    abstract void show();
}

abstract class Demo extends Super {

    // If child class is not abstract, then it must implement the abstract methods of parent class, otherwise it will be an abstract class
    int detele() {

        System.out.println("Delete called on Demo");

        return 0; 
    }
}


class Sub extends Super {

    void show() {

        System.out.println("Show called");
    }
}
