package AlgorithmsDataStructure.Lesson5_GreedyAlgorithm;

public class FindStation {
    public static void main(String[] args) {
        int capacity = 400;
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, capacity));
    }
    public static int minStops(int[] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length -1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop) return -1;
            if (nextStop < stations.length -1) result++;
            currentStop = nextStop;

        }
        return result;
    }
}
