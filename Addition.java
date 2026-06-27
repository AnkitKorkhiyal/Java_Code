public class Addition {

    int m1(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Addition obj = new Addition();
        int result = obj.m1(10, 20);
        System.out.println("The addition of two numbers is: " + result);
    }
}


