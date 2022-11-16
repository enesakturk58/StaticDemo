public class ProductValidator {

    static {
        System.out.println("Static yapici blok calisti.");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok calisti");  // nesne olusturulmadan bu calismaz...!
    }
    public static boolean isValid(Product product) {
        return product.getPrice() > 0 && !product.getName().isEmpty();
    }
}
