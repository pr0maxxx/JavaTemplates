package practices.pr_6.builder;

public class TeslaBuilder implements Builder {
    Car car = new Car();

    @Override
    public void BuildEngine() {
        car.buildEngine("Electrical engine");
    }

    @Override
    public void SetDirector() {
        car.setDirector("Tesla");
    }

    @Override
    public Car GetResult() {
        return car;
    }
}
