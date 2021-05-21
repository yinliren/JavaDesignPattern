package decorator;


public class CoffeeBar {

    public static void main(String[] args) {

        // 1.LongBlack
        Drink order = new LongBlack();
        System.out.println("1 Long Black Costs=" + order.cost());
        System.out.println("The drink includes: " + order.getDes());

        // 2.
        order = new Milk(order);

        System.out.println("Price =" + order.cost());
        System.out.println("the drink includes: " + order.getDes());

        // 3. order

        order = new Chocolate(order);

        System.out.println("Price = " + order.cost());
        System.out.println("The drink includes: " + order.getDes());

        // 4.

        order = new Chocolate(order);

        System.out.println("Price =" + order.cost());
        System.out.println("The drink includes: " + order.getDes());

        System.out.println("===========================");

        Drink order2 = new DeCaf();

        System.out.println("Price = " + order2.cost());
        System.out.println("The drink includes: " + order2.getDes());

        order2 = new Milk(order2);

        System.out.println("Price = " + order2.cost());
        System.out.println("The drink includes: " + order2.getDes());


    }

}
