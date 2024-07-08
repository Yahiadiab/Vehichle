public abstract class Vehicle {
    public int weightLoad;

    public Vehicle(int weightLoad) {
        this.weightLoad = weightLoad;
    }

    public abstract int getVehicleWeightLoad();
}
