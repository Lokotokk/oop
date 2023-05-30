package lesson1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public List<Product> getVending() {
        return vending;
    }

    private List<Product> vending = new ArrayList<>();
    private double cash;

    public VendingMachine addProduct(Product prod) {
        vending.add(prod);
        return this;
    }
    
    public Product findProduct(String name) {
        for (Product product:vending) {
            if (name.equals(product.getProductName()))  {
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Product saleProduct(String nameProd) {
        Product founded = findProduct(nameProd);
        if (founded != null) {
            cash = cash + founded.getProductPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В атомате денег: ").append(cash).append("\n");
        for (Product product: vending) {
           sb.append(product).append("\n");
        }
        return sb.toString();
    }
}
