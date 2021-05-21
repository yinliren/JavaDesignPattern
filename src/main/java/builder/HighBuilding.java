package builder;

public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("High Building Base building 100 meters");
    }

    @Override
    public void buildWalls() {
        System.out.println("Thick wall for high building 20cm ");
    }

    @Override
    public void roofed() {
        System.out.println("High Building's Roof building Transparent");
    }

}
