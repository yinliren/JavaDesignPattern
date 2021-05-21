package flyweight;

public class Client {

    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("News Website");


        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("Twitter");

        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteCategory("Facebook");

        webSite3.use(new User("smith"));

        WebSite webSite4 = factory.getWebSiteCategory("Facebook");

        webSite4.use(new User("king"));

        System.out.println("The total instances = " + factory.getWebSiteCount());
    }

}
