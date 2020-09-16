package UIObjects;

import Handler.Handler;

import java.awt.*;

public abstract class UIObjects {

    protected float x, y, width, height;
    protected Handler handler;

    public UIObjects(float x, float y, float width, float height, Handler handler) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.handler = handler;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}
