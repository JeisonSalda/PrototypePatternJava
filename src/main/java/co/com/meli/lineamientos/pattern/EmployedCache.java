package co.com.meli.lineamientos.pattern;

import java.util.HashMap;
import java.util.Map;

public class EmployedCache {

    private Map<String, Prototype> cache;

    public EmployedCache(){
        this.cache = new HashMap<>();
        this.cache.put("CC123", new Employed("CC123", "Pedro", 100));
        this.cache.put("CC123", new Employed("CC124", "Jorge", 100));
        this.cache.put("CC123", new Employed("CC423", "Juan", 100));
    }

    public Prototype getEmployedByIdentification(String identification) {
        return this.cache.get( identification ).clone();
    }

}
