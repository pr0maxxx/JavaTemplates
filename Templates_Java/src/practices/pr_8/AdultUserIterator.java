package practices.pr_8;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class AdultUserIterator implements Iterator<User> {
    private List<User> users;
    private int position;

    public AdultUserIterator(List<User> users) {
        this.users = users;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        while (position < users.size()){
            if(users.get(position).getAge() > 17) return true;
            position++;
        }
        return false;
    }

    @Override
    public User next() {
        if(hasNext()){
            User u = users.get(position);
            position++;
            return u;
        } else {
            throw new NoSuchElementException();
        }
    }
}
