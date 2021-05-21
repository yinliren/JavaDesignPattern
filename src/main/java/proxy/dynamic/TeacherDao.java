package proxy.dynamic;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("The Teacher is teaching......");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
