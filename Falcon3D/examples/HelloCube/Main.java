import falcon3d.core.Engine;
import falcon3d.scene.Scene;
import falcon3d.window.Window;
import falcon3d.objects.Cube;

public class Main {

    public static void main(String[] args) 
    {

        Window window = new Window("Falcon3D", 1280, 720);

		Scene scene = new Scene();

        Cube cube = new Cube();

        scene.add(cube);

        Engine engine = new Engine(window, scene);

        engine.start();

    }

}