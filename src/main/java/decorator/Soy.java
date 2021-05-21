package decorator;

public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("1 cup of soy milk");
        setPrice(1.5f);
    }

}
