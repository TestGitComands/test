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
    
    public void setAge(int age){
        this.age = age;   
    }

    public Animal setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
