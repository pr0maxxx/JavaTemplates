package practices.pr_3;

import java.util.*;
import java.util.concurrent.locks.*;

public class MapUsingLock {
    private Map<String, String> map = new HashMap<String, String>();
    private Lock lock = new ReentrantLock();

    public String get(String key) {
        lock.lock();
        try {
            return map.get(key);
        } finally {
            lock.unlock();
        }
    }

    public String put(String key, String value) {
        lock.lock();
        try {
            return map.put(key, value);
        } finally {
            lock.unlock();
        }
    }

    public void clear() {
        lock.lock();
        try {
            map.clear();
        } finally {
            lock.unlock();
        }
    }
}