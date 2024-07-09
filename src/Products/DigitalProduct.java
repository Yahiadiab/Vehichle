package Products;

public abstract class DigitalProduct extends Product {

    public DigitalProduct(String productName, int productPrice, int productWeight, int vehicleID) {


        super(productName, productPrice, productWeight, vehicleID);



    }

    @Override
    public String getProductName() {
        return "DigitalProduct";
    }


}
