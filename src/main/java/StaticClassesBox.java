public class StaticClassesBox {


    static class SomeStaticClass {
        static String a = "Zap";
    }
}

class SomeOutherClass {

    String b = StaticClassesBox.SomeStaticClass.a;

}
