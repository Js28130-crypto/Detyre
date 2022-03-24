package Aggregation;

public class Aggregation {
    public static void main(String[] args) {
        //create procducts

        Product p1 = new Product(1, "Pen", "This is red pen");
        Product p2 = new Product(2, "Pencil", "This is pencil");
        Product p3 = new Product(3, "ColorBox", "This is color box");

        //create lineItem and quantity of the products
        LineItem item1 = new LineItem(1, 2, p1);
        LineItem item2 = new LineItem(1, 2, p2);
        LineItem item3 = new LineItem(1, 2, p3);

        //before deletng line item 1
        System.out.println(item1.getId());
        System.out.println(item1.getQuantity());
        System.out.println(item1.getP());
        item1 = null;

        //still product exist and not deleted
        System.out.println(p1);
    }
}
