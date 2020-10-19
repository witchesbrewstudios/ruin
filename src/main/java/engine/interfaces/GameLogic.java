package engine.interfaces;

import engine.Window;

public interface GameLogic {

    void init() throws Exception;

    void handleInput(Window window);

    void handleUpdate(float interval);

    void handleRender(Window window);

    void handleCleanup();
}
