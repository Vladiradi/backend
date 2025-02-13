//Создать класс собака, определить в нем переменные: порода, тип:(охотничья, декоративная и тд),
//возраст, имя владельца, сделать конструкторы
//по умолчанию, с именем, с именем и породой, с именем породой и типом, с именем породой и типом и именем владельца))


public class Dog {
        private String breed;
        private String type;
        private int age;
        private String ownerName;

    public Dog() {
            this.breed = "Неизвестная";
            this.type = "Неизвестный";
            this.age = 0;
            this.ownerName = "Без владельца";
        }

    public Dog(String breed) {
            this.breed = breed;
            this.type = "Неизвестный";
            this.age = 0;
            this.ownerName = "Без владельца";
        }

    public Dog(String breed, String type) {
            this.breed = breed;
            this.type = type;
            this.age = 0;
            this.ownerName = "Без владельца";
        }

    public Dog(String breed, String type, int age) {
            this.breed = breed;
            this.type = type;
            this.age = age;
            this.ownerName = "Без владельца";
        }

    public Dog(String breed, String type, int age, String ownerName) {
            this.breed = breed;
            this.type = type;
            this.age = age;
            this.ownerName = ownerName;
        }

        public void displayInfo() {
            System.out.println("Порода: " + breed);
            System.out.println("Тип: " + type);
            System.out.println("Возраст: " + age + " лет");
            System.out.println("Владелец: " + ownerName);
        }

        public static void main(String[] args) {
            Dog dog1 = new Dog();
            Dog dog2 = new Dog("Лабрадор");
            Dog dog3 = new Dog("Овчарка", "Служебная");
            Dog dog4 = new Dog("Хаски", "Спортивная", 3);
            Dog dog5 = new Dog("Бигль", "Охотничья", 5, "Алексей");
            System.out.println("Информация о собаках:");
            dog1.displayInfo();
            System.out.println();
            dog2.displayInfo();
            System.out.println();
            dog3.displayInfo();
            System.out.println();
            dog4.displayInfo();
            System.out.println();
            dog5.displayInfo();
        }

    }
}
