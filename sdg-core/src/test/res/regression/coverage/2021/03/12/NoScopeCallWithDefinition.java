class Test {

    int x = 10;

    void f() {
        x++;
    }

    void start() {
        f();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        System.out.println(t.x);
    }
}

