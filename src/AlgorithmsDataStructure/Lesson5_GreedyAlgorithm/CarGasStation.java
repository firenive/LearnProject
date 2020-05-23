package Algorithmes.Lesson7_GreedyAlgorithm_PartTwo;

public class CarGasStation {
    public static void main(String[] args) {
        // https://youtu.be/-oVLNP2EqVw
        // необходимо найти минимальное количество остановок для заправки автомобиля по пути
        int[] stations = {0, 200, 375, 550, 750, 950}; // содержит в себе список заправочных станций, на которорых можно
        // остановитья и заправить автомобиль. 0 - начальная точка маршрута. 950 - конечная точка маршрута
        int[] stations2 = {0, 1000, 2000};

        int capacity = 400; // растояние которое автомобиль может проехать без заправки
        System.out.println(minStops(stations, capacity));

    }
    public static int minStops(int[] stations, int capacity) { // метод выдает минимальное количество остановок при пути из A -> B
        // В качестве первого параметра передается расстояние между остановками.
        // В качестве второго параметра передается вместимость бака автомобиля в километрах

        int result = 0;
        int currentStop = 0; // отображает ту остановку, на которой сечас находится машина

        while (currentStop < stations.length - 1) { // цикл работает пока не доедем до последней отановки
            int nextStop = currentStop; // необходимо определить самую дальнюю возможную остановку
            while (nextStop < stations.length -1 && stations[nextStop +1]
                    -stations[currentStop] <= capacity)  nextStop++;
                // цикл проверяет расстояние между текущей и следующей остановкой на вместимость бака автомобиля
                // Если следующая остановка  проверяем следующую остановку (увеличиваем nextStop на 1

            if (currentStop == nextStop) return -1; // условие выполняется втом случае, если нельзя доехать ни до одной
            // заправки из начальной точки (массив stations2)

            if (nextStop < stations.length - 1) result++; // Если точка nextStop не является коненой точкой, а является
            // бензоколонкой увеличиваем result
            currentStop = nextStop;



        }
        return result;

    }
}
