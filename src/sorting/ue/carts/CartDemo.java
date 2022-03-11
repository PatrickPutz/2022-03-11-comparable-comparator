package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

    public static void main(String[] args) {

        Cart c1 = new Cart("pat", 12, 20, 189.99);
        Cart c2 = new Cart("pslayer69", 3, 15, 2000.00);
        Cart c3 = new Cart("mary", 5, 25, 120.00);

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(c1);
        carts.add(c2);
        carts.add(c3);

        System.out.println(carts.toString());

        Collections.sort(carts);
        System.out.println("Comparable " + carts.toString());

        Collections.sort(carts, new CartUsernameComparator());
        System.out.println("Username Comparator " + carts.toString());

        Collections.sort(carts, new CartTotalItemsComparator());
        System.out.println("Total Items Comparator " + carts.toString());





    }

}
