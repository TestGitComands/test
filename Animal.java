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
}
