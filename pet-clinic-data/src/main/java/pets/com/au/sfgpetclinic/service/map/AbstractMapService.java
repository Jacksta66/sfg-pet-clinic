package pets.com.au.sfgpetclinic.service.map;

import pets.com.au.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return  new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object Cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
            // first one to generate will be null
        } catch(NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }

}
