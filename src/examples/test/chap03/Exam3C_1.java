package examples.test.chap03;

class Id {
    private static int counter = 0;
    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }
}

class A {
    static void bar() {
        System.out.println( "A" );
    }
}

class B extends A {
    static void bar() {
        System.out.println( "B" );
    }
}

public class Exam3C_1 {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        a.getCounter();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + Id.getCounter());

        A foo = new B();
        foo.bar();
    }
}
