package practice08;

public class Student extends Person {
    protected Klass klass;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(name, age);
        this.id = id;
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(klass.getLeader() == this) {
            return super.introduce() + String.format(" I am a Student. I am Leader of Class %s.", this.klass.getNumber());
        }
        return super.introduce() + String.format(" I am a Student. I am at Class %s.", this.getKlass().getNumber());
    }
}
