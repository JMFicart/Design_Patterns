package Composition;

public class TestComposition1 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.getValue());
        c.inc();
        System.out.println(c.getValue());

        D d = new D();
        System.out.println(d.getValue());
        d.inc();
        System.out.println(d.getValue());

        System.out.println(d.isEven());
    }
}

class C{
    private int cpt = 0;

    public int getValue() {
        return cpt;
    }

    public void inc() {
        cpt++;
    }
}

class D {
    private C mysuper = new C();

    public boolean isEven() {
        return getValue() %2 == 0;
    }

    public int getValue() {
        return mysuper.getValue();
    }

    public void inc() {
        mysuper.inc();
    }
}

