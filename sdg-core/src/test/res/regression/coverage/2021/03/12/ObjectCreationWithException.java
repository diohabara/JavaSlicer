class Test {

    public Test() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            Test t = new Test();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}

