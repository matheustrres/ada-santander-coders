package main;

public class ProductFactory {
    public static Product getInstance(ProductType productType) {
        switch (productType) {
            case ProductType.PHYSICAL:
                PhysicalProduct physicalProduct = new PhysicalProduct();
                physicalProduct.setHasPhysicalDimensions(true);
                return physicalProduct;

            case ProductType.DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setHasPhysicalDimensions(false);
                return digitalProduct;

            default:
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
