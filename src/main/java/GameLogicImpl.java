import engine.Window;
import engine.interfaces.GameLogic;

import static org.lwjgl.glfw.GLFW.GLFW_KEY_DOWN;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_UP;

public class GameLogicImpl implements GameLogic {

    private int direction = 0;

    private float color = 0.0f;

    private final Renderer renderer;

    public GameLogicImpl() {
        renderer = new Renderer();
    }

    @Override
    public void init() throws Exception {
        renderer.init();
    }

    @Override
    public void handleInput(Window window) {
        if (window.isKeyPressed(GLFW_KEY_UP)) {
            direction = 1;
        } else if (window.isKeyPressed(GLFW_KEY_DOWN)) {
            direction = -1;
        } else {
            direction = 0;
        }
    }

    @Override
    public void handleUpdate(float interval) {
        color += direction * 0.01f;
        if (color > 1) {
            color = 1.0f;
        } else if (color < 0) {
            color = 0.0f;
        }
    }

    @Override
    public void handleRender(Window window) {
        window.setClearColor(color, color, color, 0.0f);
        renderer.render(window);
    }

    @Override
    public void handleCleanup() {
        renderer.cleanup();
    }
}
