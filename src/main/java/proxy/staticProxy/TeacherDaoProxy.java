package proxy.staticProxy;

public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Proxy starts.....");
        target.teach();
        System.out.println("Submit....");
    }

}
