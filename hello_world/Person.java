package hello_world;

public class Person {

    private final String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
