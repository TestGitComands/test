public class Human {

    private String name;
    private int age;

    private String gender;


    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }
}
