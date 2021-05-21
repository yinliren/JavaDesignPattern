package flyweight;

public class ConcreteWebSite extends WebSite {

    // website type
    private String type = "";


    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        // TODO Auto-generated method stub
        System.out.println("The type of the website is:" + type + " and the user is " + user.getName());
    }


}
