package main;

public class Main {
    public static void main(String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setHasPhysicalDimensions(true);

        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setHasPhysicalDimensions(false);

        // Using Factory Method
        Product physicalProduct2 = ProductFactory.getInstance(ProductType.PHYSICAL);
        Product digitalProduct2 = ProductFactory.getInstance(ProductType.DIGITAL);

        System.out.println(physicalProduct);
        System.out.println(physicalProduct2);
        System.out.println(digitalProduct);
        System.out.println(digitalProduct2);
    }
}