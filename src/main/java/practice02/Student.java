package practice02;

public class Student extends Person{

    protected int klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String str = "I am a Student. I am at Class " + klass + ".";
        return str;
    }
}
