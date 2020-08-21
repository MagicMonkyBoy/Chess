package Board;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Tile {

    private int x, y, width, height;
    private Color color;
    private Rectangle bounds;
    private boolean hovering = false;

    public Tile(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        bounds = new Rectangle(x, y, width, height);
    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);

    }

    public void renderHovering(Graphics g) {
        if (hovering) {
            g.setColor(Color.red);
            g.drawRect(x, y, width, height);
        }
    }

    public void onMouseMove(MouseEvent e) {
        if (bounds.contains(e.getX(), e.getY())) {
            hovering = true;
        } else {
            hovering = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
