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
        if(this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", this.klass);
        }
    }
}
