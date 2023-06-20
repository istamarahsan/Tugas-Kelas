package after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubordinateRegistry {

    private Map<String, List<String>> subordinates = new HashMap<>();

    public void registerSubordinate(String id, String subordinateId) {
        if (subordinates.containsKey(id)) {
            subordinates.get(id).add(subordinateId);
        } else {
            subordinates.put(id, new ArrayList<>(List.of(subordinateId)));
    }

    }
    public List<String> getSubordinatesOf(String id) {
        return subordinates.containsKey(id) ? subordinates.get(id) : List.of();
    }
}
