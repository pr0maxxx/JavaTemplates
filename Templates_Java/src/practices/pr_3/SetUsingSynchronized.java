package practices.pr_3;

import java.util.*;
import java.util.concurrent.locks.*;

public class SetUsingSynchronized {
    private Set<String> set = Collections.synchronizedSet(new HashSet<String>());

    public boolean add(String s) {
        return set.add(s);
    }

    public boolean remove(String s) {
        return set.remove(s);
    }

    public void clear() {
        set.clear();
    }
}