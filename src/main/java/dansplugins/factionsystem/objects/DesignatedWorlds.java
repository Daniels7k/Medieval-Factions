package dansplugins.factionsystem.objects;

import java.util.ArrayList;
import java.util.List;

public class DesignatedWorlds {

    private ArrayList<String> designatedWorlds = new ArrayList<>();

    public void addWorld(String worldToAdd) {
        if (!designatedWorlds.contains(worldToAdd)) {
            designatedWorlds.add(worldToAdd);
        }
    }

    public void removeWorld(String worldToRemove) {
        designatedWorlds.remove(worldToRemove);
    }

    public List<String> save() {
        // TODO
        return null;
    }

    public void load() {
        // TODO
    }

}
