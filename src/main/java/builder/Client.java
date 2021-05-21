package builder;


public class Client {
    public static void main(String[] args) {

        HouseBuilder commonHouseBuilder = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House house = houseDirector.constructHouse();

        System.out.println("--------------------------");
        HouseBuilder highBuildingBuilder = new HighBuilding();
        houseDirector.setHouseBuilder(highBuildingBuilder);
        houseDirector.constructHouse();

    }
}
