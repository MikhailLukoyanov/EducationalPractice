package adapter;

public class Runner {
    private Road road;

    public Runner(Road road){
        this.road = road;
    }

    public void runOnTheRoad() {
        System.out.println("Начало");
        road.run();
        System.out.println("Конец");
    }
}
