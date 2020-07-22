package practice07;

public class Teacher extends Person {
    protected Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", this.klass.number);
        }
    }

    public String introduceWith(Student student) {
        if(this.klass.number == student.klass.number) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", this.name, this.age, student.name);
        } else{
            return String.format("My name is %s. I am %s years old. I am a Teacher. I don't teach %s.", this.name, this.age, student.name);
        }
    }
}
