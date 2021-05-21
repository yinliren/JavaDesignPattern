package builder;
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("Common house base building 5 meters");
    }

    @Override
    public void buildWalls() {
        System.out.println("Common House's wall building 10cm ");
    }

    @Override
    public void roofed() {
        System.out.println("Common House's Roof Building");
    }

}
