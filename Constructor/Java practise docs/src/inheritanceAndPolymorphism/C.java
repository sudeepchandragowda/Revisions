package inheritanceAndPolymorphism;

public class C extends B {
    int z;

    public C(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void helloC(){
        System.out.println("Hello World from C");
         this.helloB();
        helloA();
    }
    public void helloB() {
        System.out.println("Hello world from class C for class B");
    }
}

/*
    1. Constructor calls parent attributes
    2. When we use parameterised constructors, we cannot call parent attributes
    3. That is where Super key comes into picture
 */
