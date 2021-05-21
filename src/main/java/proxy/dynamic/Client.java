package proxy.dynamic;

public class Client {

    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        System.out.println("proxyInstance=" + proxyInstance.getClass());

        proxyInstance.teach();

        proxyInstance.sayHello(" tom ");
    }

}
