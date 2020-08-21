package GameObjects;

import java.awt.*;

public abstract class Pieces {

    protected int x, y, width, height;
    protected boolean isSelected = false;

    public Pieces() {

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
