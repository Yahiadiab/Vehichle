public class Car extends Vehicle {

    int weightLoad;

    public Car(int weightLoad) {
        super(weightLoad);
    }

    @Override
    public int getVehicleWeightLoad() {
        return this.weightLoad;
    }
}
