package falcon3d.internal.lwjgl;

import static org.lwjgl.glfw.GLFW.*;

public class GLWindow {

    private long handle;

    public void create(String title, int width, int height) {

        if (!glfwInit()) {
            throw new RuntimeException("Failed to initialize GLFW.");
        }

        glfwDefaultWindowHints();

        glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        handle = glfwCreateWindow(width, height, title, 0, 0);

        if (handle == 0) {
            throw new RuntimeException("Failed to create GLFW window.");
        }

        glfwMakeContextCurrent(handle);

        glfwSwapInterval(1);

        glfwShowWindow(handle);
    }

    public void update() {

        glfwSwapBuffers(handle);

        glfwPollEvents();
    }

    public boolean shouldClose() {

        return glfwWindowShouldClose(handle);
    }

    public void destroy() {

        glfwDestroyWindow(handle);

        glfwTerminate();
    }

    public long getHandle() {

        return handle;
    }
}