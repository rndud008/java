package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product,Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {

        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + quantity);
    }


    public void printAll() {
        System.out.println("== 모든 상품 출력==");
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();

        for (Map.Entry<Product,Integer> entry :entries){
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int minusQuantity){
        Integer existingQuantity = cartMap.getOrDefault(product, 0);

        int newQuantity = existingQuantity - minusQuantity;
        if(newQuantity<= 0){
            cartMap.remove(product);
        }else {
            cartMap.put(product,newQuantity);
        }

    }
}
