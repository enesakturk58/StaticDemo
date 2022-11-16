public class ProductManager {

    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("'" + product.getName() + "' ürünü eklendi.");
        } else
            System.out.println("Ürün eklenilmedi.");
    }
}
