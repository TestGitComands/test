public class Human {

    private String name;
    private int age;

    public Human(String name) {
        this.name = name;
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
