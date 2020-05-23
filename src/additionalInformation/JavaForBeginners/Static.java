package additionalInformation.JavaForBeginners;

public class Static {
    public static void main(String[] args) {
        // Зачем нужны статически переменные и методы:
        // 1) они нужны если методу не нужно знать переменные объекта. Если нам не нужен объект класса для использования методов класса
        System.out.println(Math.pow(2,4)); // например класса math с большим количеством статияеских методов
        Human im = new Human("Maksim", 26);
        im.setName("Mark");
        Human.description = "Nice"; // мы можем обратиться к статической переменной не создавая объект класса а напрямую из класса
        // Переменная принадлежит классу Human  и является общей для всех объектов класса
        System.out.println(Human.getDescription());
        im.description = "Easy";
        Human pers = new Human("Pavel", 32);
        im.getAllFields();
        pers.getAllFields();
        Human.setDescription("new description"); // при смене значения статической переменной данные меняются у всех объектов класса
        pers.getAllFields();
        im.getAllFields();
        Human.printNumberOfPeople();
    }
}

class Human {
    private String name; // эти переменные являются переменными объекта, так как у всех объектов они разные
    private int age; // переменные инициализируются только при создании объекта класса (конкретного человека)
    private static int countPeople;
    public static String description;
    public static String getDescription() {
        return description;
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }
    public static void setDescription(String description) {
        Human.description = description;
        // System.out.println(name); из статического метода мы не можем обращаться к переменным объекта. статический метод
        // может работать только со статическими переменными
        // на момент запуска программы статические методы и объекты уже существуют. Переменным назначаются значения по умолчанию
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++; // увеличиваем преременную на один при создани каждого объекта класса для подсчета сотрудников
    }
    public static void printNumberOfPeople() {
        System.out.println("Number of people is: " + countPeople);
    }
    public Human() {
        this.name = "Default";
        this.age = 10;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
