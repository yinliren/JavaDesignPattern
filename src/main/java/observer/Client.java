package observer;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        System.out.println("");
        weatherData.setData(10f, 100f, 30.3f);


        weatherData.removeObserver(currentConditions);

        System.out.println();
        System.out.println("");
        weatherData.setData(10f, 100f, 30.3f);
    }

}
