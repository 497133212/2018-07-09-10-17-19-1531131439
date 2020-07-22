package practice06;

public class Teacher extends Person {

    protected Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        Person person = new Person("Tom", 21);
        if(this.klass == null) {
            return person.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return person.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }
    }
}
