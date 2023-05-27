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
}
