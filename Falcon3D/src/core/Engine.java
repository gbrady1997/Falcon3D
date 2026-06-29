package falcon3d.core;

import falcon3d.scene.Scene;
import falcon3d.window.Window;

public class Engine {

    private Window window;
    private Scene scene;
    private boolean running;

    public Engine(Window window, Scene scene) {
        this.window = window;
        this.scene = scene;
    }

    public void start() {

        initialize();

        running = true;

        while (running && window.isOpen()) {

            update();

            render();
        }

        shutdown();
    }

    private void initialize() {

        System.out.println("Initializing Falcon3D Engine...");

        window.create();
    }

    private void update() {

        scene.update();

        window.update();
    }

    private void render() {

        // Renderer will be added in Version 0.1
    }

    private void shutdown() {

        window.destroy();

        System.out.println("Falcon3D Engine stopped.");
    }

    public void stop() {

        running = false;
    }
}