package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Department> departmentList;


    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("Information Security Major", "Information Security");
        addDepartment("Network Security Major", "Network Security");
        addDepartment("Server Security Major", "Server Security");
    }

    @Override
    public String getName() {
        return "Information Engineering College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }

}
