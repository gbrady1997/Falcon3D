package falcon3d.window;

import falcon3d.internal.lwjgl.GLWindow;

public class Window {

    private String title;
    private int width;
    private int height;

    private GLWindow glWindow;

    public Window(String title, int width, int height) {

        this.title = title;
        this.width = width;
        this.height = height;

        glWindow = new GLWindow();
    }

    public void create() {

        glWindow.create(title, width, height);
    }

    public void update() {

        glWindow.update();
    }

    public void destroy() {

        glWindow.destroy();
    }

    public boolean isOpen() {

        return !glWindow.shouldClose();
    }
}