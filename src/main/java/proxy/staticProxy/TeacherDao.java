package proxy.staticProxy;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

}
