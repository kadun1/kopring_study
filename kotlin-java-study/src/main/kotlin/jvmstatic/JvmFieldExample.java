package jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {
//        JvmFieldClass.Companion.getId();
        int id = JvmFieldClass.id;

//        JvmFieldObject.INSTANCE.getName();
        String name = JvmFieldObject.name;

        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
