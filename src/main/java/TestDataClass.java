public class TestDataClass {

    public static void main(String[] args) {

        JavaDataClass javaDataClass = new JavaDataClass(1, "1", true);

        System.out.println(javaDataClass);

    }
}

class JavaDataClass{

    int a;
    String b;
    boolean c;

    public JavaDataClass(int a, String b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
