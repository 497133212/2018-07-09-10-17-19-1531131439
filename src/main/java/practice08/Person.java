package practice08;

public class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj) {
        Person person = null;
        if (obj instanceof Person) {
            person = (Person) obj;
            if (person.name == this.name && person.age == this.age && person.id == this.id)
                return true;
            else
                return false;
        }else
            return false;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.",this.name,this.age);
    }
}
