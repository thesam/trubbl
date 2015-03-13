package trubbl.sharedkernel.persistence;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import trubbl.sharedkernel.domain.Key;
import trubbl.sharedkernel.domain.Keyable;

public abstract class GenericRepository<V extends Keyable> {

	private Map<Key, V> storage = new ConcurrentHashMap<>();

	public V get(Key key) {
		return storage.get(key);
	}

	public void create(V value) {
		storage.put(value.key(), value);
	}

	public Collection<V> search() {
		return storage.values();
	}
}
