import java.util.Objects;

public class Animal {

    private String name;
    private Integer age;
    private String desc;
    
    public String getName(){
        return this.name;   
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Animal setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Animal setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Animal(String name, Integer age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal animal)) {
            return false;
        }
        return Objects.equals(getName(), animal.getName()) && Objects.equals(getAge(), animal.getAge()) && Objects.equals(getDesc(),
            animal.getDesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getDesc());
    }

    @Override
    public String toString() {
        return "Animal{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", desc='" + desc + '\'' +
            '}';
    }
}
