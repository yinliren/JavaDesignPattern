package composite;

public class Client {

    public static void main(String[] args) {

        OrganizationComponent university = new University("UCLA", "UC Los Angeles ");

        OrganizationComponent computerCollege = new College("CS", "Computer Science");
        OrganizationComponent infoEngineercollege = new College("Info Engineer", "IT, CS");


        computerCollege.add(new Department("Software Engineer", "SE"));
        computerCollege.add(new Department("Network Engineer", "NE"));
        computerCollege.add(new Department("Computer Information", "CI system"));

        infoEngineercollege.add(new Department("Communication Engineering", "Hard Major"));
        infoEngineercollege.add(new Department("Information Engineering", "Easy Major"));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.print();
        infoEngineercollege.print();
    }

}
