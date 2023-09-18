package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "스티브로저스";
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        System.out.println(student.name);
        System.out.println(student.getBirthDate());

//        student.setAge(10);
        System.out.println(student.getAge());

//        student.setGrade("A");
        student.changeGrade("A");
        System.out.println(student.getGrade());

    }
}
