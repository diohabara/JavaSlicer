class Test {

    public Test() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            Test t = new Test2();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}

class Test2 extends Test {

    public Test2() throws Exception {}
}

