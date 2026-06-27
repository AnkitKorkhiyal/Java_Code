interface InterfaceDemo {
    void m1();
}
class Interfaceclass implements InterfaceDemo {
    public void m1() {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("The addition of two numbers is: " + result);
    }
    public static void main(String[] args) {
        Interfaceclass obj = new Interfaceclass();
        obj.m1();
    }
}
