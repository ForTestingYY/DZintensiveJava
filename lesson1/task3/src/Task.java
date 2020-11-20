
public class Task {
    private String name;
    private String surname;
    private int age;
    private String description;

    public static void main(String[] args) {
        Task task = new Task("Arya","Stark",12,"I like it");

        System.out.println(task.toString());
    }
    public Task(String name, String surname, int age, String description) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.description = description;
    }

    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old "
                + "I learn Java because " + description;

    }
}