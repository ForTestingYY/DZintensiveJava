public class Dog extends Animal{
    public Dog (String name){
        this.setName(name);
    }

    public Dog(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public Dog(){
        this.setName("Имя не известно");
        this.setAge(1);
    }

    public void talk() {
        System.out.println("Гав!");
    }
}