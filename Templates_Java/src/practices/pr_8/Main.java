package practices.pr_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> newList = new ArrayList<User>();
        newList.add(new User("Иван", 16));
        newList.add(new User("Маша", 17));
        newList.add(new User("Коля", 18));

        Iterator<User> it = new AdultUserIterator(newList);
        while (it.hasNext()){
            User u = it.next();
            System.out.println(u.getName());
        }
    }
}
