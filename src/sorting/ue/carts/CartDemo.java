package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        // anonyme Klassen verwenden
        Collections.sort(carts, new Comparator<Cart>() {
            @Override
            public int compare(Cart o1, Cart o2) {
                return Integer.compare(o2.getNumArticles(), o1.getNumArticles());
            }
        });
        System.out.println("Number Articles = " + carts.toString());

        // Lambda Expression
        Collections.sort(carts, (p1,p2) -> p1.getUsername().compareTo(p2.getUsername()));
        System.out.println("carts = " + carts);

        // Lambda über Hilfsklasse = Comparator.comparing
        Collections.sort(carts, Comparator.comparing(Cart::getUsername));
        System.out.println("carts = " + carts);
    }

}
