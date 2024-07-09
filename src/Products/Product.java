package Products;

public abstract class Product {
    protected String productName;
    protected int productPrice;
    protected int productWeight;
    protected int vehicleId; // Added vehicleId to associate product with vehicle

    public Product(String productName, int productPrice, int productWeight, int vehicleId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
        this.vehicleId = vehicleId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getProductType();
}
