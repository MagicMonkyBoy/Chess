package GameObjects;

import Handler.Handler;

import java.awt.*;

public abstract class Pieces {

    protected int x, y, width, height;
    protected Color color;
    protected boolean isSelected = false;
    protected Handler handler;

    public Pieces(int x, int y, int width, int height, Color color, Handler handler) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.handler = handler;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
    public abstract void move(int x, int y);
    public void select() {
        isSelected = true;
    }
    public void deSelect() {
        isSelected = false;
    }

}
