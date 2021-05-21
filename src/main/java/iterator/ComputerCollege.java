package iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java Major", "Java");
        addDepartment("PHP Major", "PHP");
        addDepartment("Big Data Major", "Big Data");

    }


    @Override
    public String getName() {
        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

}
