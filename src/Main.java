public class Main {
    public static void main(String[] args) {

        ProductManager manager =new ProductManager();
        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setPrice(10.00);
        manager.add(product1);


    }
}