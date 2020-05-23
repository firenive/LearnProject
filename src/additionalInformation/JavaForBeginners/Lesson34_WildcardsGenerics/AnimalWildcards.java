package additionalInformation.JavaForBeginners.Lesson34_WildcardsGenerics;

public class AnimalWildcards {
    private int id;
    private String type;

    // Если в классе не был создан конструктор используется дефолтный конструктор public AnimalWildcards() {}

    public AnimalWildcards(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public AnimalWildcards() {
    }
    public void eat() {
        System.out.println("Animal is eating");
    }


    @Override
    public String toString() {
        return "id: " + String.valueOf(id) + " name: " + type; // преобразование int в  строку для соответствия типу возвращаемого значения
    }
}
