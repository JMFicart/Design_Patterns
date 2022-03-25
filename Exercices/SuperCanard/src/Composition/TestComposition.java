package Composition;

public class TestComposition {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getValue());
        a.inc();
        System.out.println(a.getValue());

        B b = new B();
        System.out.println(b.getValue());
        b.inc();
        System.out.println(b.getValue());

        System.out.println(b.isEven());
    }
}

interface Ia{
    void inc();
    int getValue();
}

class A implements Ia {
    private int cpt = 0;

    public int getValue() {
        return cpt;
    }

    public void inc() {
        cpt++;
    }

}

//class B extends A{
//    public boolean isEven() {
//        return getValue() %2 == 0;
//    }
//}

class B implements Ia{
    private A mysuper = new A();

    public boolean isEven() {
        return getValue() %2 == 0;
    }

    @Override
    public void inc() {

    }

    @Override
    public int getValue() {
        return 0;
    }
}
