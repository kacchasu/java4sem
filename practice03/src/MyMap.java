import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MyMap<K, V> implements Map<K, V> {
    private Map<K, V> map = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1);
    @Override
    public int size() {
        try {
            semaphore.acquire();
            var result = map.size();
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            semaphore.acquire();
            var result = map.isEmpty();
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            semaphore.acquire();
            var result = map.containsKey(key);
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            semaphore.acquire();
            var result = map.containsValue(value);
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public V get(Object key) {
        try {
            semaphore.acquire();
            var result = map.get(key);
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            semaphore.acquire();
            var result = map.put(key, value);
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public V remove(Object key) {
        try {
            semaphore.acquire();
            var result = map.remove(key);
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        try {
            semaphore.acquire();
            map.putAll(m);
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            map.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<K> keySet() {
        try {
            semaphore.acquire();
            var result = map.keySet();
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Collection<V> values() {
        try {
            semaphore.acquire();
            var result = map.values();
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        try {
            semaphore.acquire();
            var result = map.entrySet();
            semaphore.release();
            return result;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
