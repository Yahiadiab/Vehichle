public class Truck extends Vehicle {

    public Truck(int weightLoad) {
        super(weightLoad);
    }

    @Override
    public int getVehicleWeightLoad() {
        return this.weightLoad * 4;
    }
}
