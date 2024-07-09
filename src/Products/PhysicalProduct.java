package Products;

public class PhysicalProduct extends Product {

    public PhysicalProduct(String productName, int productPrice, int productWeight, int vehicleID) {

        super(productName, productPrice, productWeight, vehicleID);

    }

    @Override
    public String getProductName() {
        return "Physical Product";
    }

    @Override
    public String getProductType() {
        return "";
    }
}
