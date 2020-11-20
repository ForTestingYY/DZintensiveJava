public class Main {
   public static void main(String[] args) {
      Cat cat1 = new Cat("Мурка");
      Cat cat2 = new Cat("Барсик", 14);
      Dog dog1 = new Dog("Дружок");
      Snake snake = new Snake();
      snake.setAge(10);
      snake.setName("Змея");
      snake.talk();
      cat1.talk();
      dog1.talk();
   }
}