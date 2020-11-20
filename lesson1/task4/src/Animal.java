public class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(String name){
        this.name = name;
    }
    public Animal(int age){
        this.name = "Не известно";
        this.age = age;
    }
    public Animal(){
        this.name = "Не известно";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    protected void talk(){
        System.out.println("Голос!");
    }
}
