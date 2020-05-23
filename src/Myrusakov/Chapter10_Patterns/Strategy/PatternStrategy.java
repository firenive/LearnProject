package Myrusakov.Chapter10_Patterns.Strategy;

public class PatternStrategy {
    private static boolean genius = false;
    private static Mouse mouse = new Mouse();
    public static void main(String[] args) {
        // паттерн определяет собой некую последовательность действий, которые используются для достижения цели
        // В нашем примере будет мышь, которая ходит по лабиринту. и для нее применяются две стратегии.
        // мышь является достаточно умной (стратегия SmartMouse) и использует для поиска выхода из лабиринта определенный алгоритм
        // мышь тупая (стратегия StupidMouse). Определенного алгоритма нет. мышь просто тыкается во все стенки пока не найдет выход
        // обе стратегии реализу.т интерфейс Strategy. Для определения новой стратегии не нжно вносить никаких изменений
        // а лишь создать новый класс, наследующий интерфейс Strategy и реализующий выбранную стратегию поведения мыши

        genius = false;
        PatternStrategy.chooseStr();
        mouse.execute(); // Действуем глупо, наугад
        genius = true;
        PatternStrategy.chooseStr();
        mouse.execute();
    }
    public static void chooseStr() {
        if (genius) mouse.setStr(new SmartMouse()); // устанавливаем выбранную стратегию для мыши
        else mouse.setStr(new StupidMouse());
    }
}

