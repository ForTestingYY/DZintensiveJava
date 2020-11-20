public class Cat extends Animal{

    public Cat (String name){
        this.setName(name);
    }

    public Cat(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public Cat(){
        this.setName("Имя не известно");
        this.setAge(1);
    }

    protected void talk() {
        System.out.println("Мяу!");
    }
}