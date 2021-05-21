package observer;

public class BaiduSite implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Baidu Weather Site");
        System.out.println("Baidu Weather Site Temperature: " + temperature + "***");
        System.out.println("Baidu Weather Site Pressure: " + pressure + "***");
        System.out.println("Baidu Weather Site Humidity: " + humidity + "***");
    }

}
