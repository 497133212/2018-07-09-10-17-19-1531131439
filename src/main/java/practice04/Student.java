package practice04;

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
        Person person = new Person("Tom", 21);
        return person.basicIntroduce() + " I am a Student. I am at Class " + klass + ".";
    }
}
