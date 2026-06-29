package falcon3d.scene;

import java.util.ArrayList;
import java.util.List;

import falcon3d.objects.Entity;

public class Scene {

    private final List<Entity> entities;

    public Scene() {

        entities = new ArrayList<>();
    }

    public void add(Entity entity) {

        entities.add(entity);
    }

    public void remove(Entity entity) {

        entities.remove(entity);
    }

    public List<Entity> getEntities() {

        return entities;
    }

    public void update() {

        for (Entity entity : entities) {

            entity.update();
        }
    }
}