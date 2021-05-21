package template;

public class Client {

    public static void main(String[] args) {

        System.out.println("Making Read Bean Soya Milk");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("Making Peanut Soya Milk");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();


        System.out.println("Making Pure Soya Milk");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }

}
