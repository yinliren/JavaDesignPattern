package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaJdkAnalysis {

    public void dummy() {
        List<Integer> dummyList1 = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i++) {
            dummyList1.add(i);
        }
        List<Integer> dummyList2 = new LinkedList<>();
        Iterator<Integer> dummyList1Itr = dummyList1.iterator();
        while (dummyList1Itr.hasNext()) {
            System.out.println(dummyList1Itr.next());
        }
    }
}
