package extensions;

public class ExtensionExample {
    public static void main(String[] args) {
//        "ABCD".first();
//        "ABCD".addFirst("Z");
        char first = MyExtensionKt.first("ABCD");
        System.out.println("first = " + first);
        String addFirst = MyExtensionKt.addFirst("ABCD", 'Z');
        System.out.println("addFirst = " + addFirst);
    }
}
