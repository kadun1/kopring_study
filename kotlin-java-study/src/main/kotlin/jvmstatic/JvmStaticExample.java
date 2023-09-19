package jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

//        String hello = HelloClass.Companion.hello();
        String hello = HelloClass.hello();

//        String hi = HiObject.INSTANCE.hi();
        String hi = HiObject.hi();
    }
}
