package GameObjects;

import Handler.Handler;

import java.awt.*;

public class Pawn extends Pieces {

    public Pawn(int x, int y, int width, int height, Color color, Handler handler) {
        super(x, y, width, height, color, handler);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillOval(x + width/4, y + height/10, width/2, height/2);
        g.fillPolygon(new int[]{x + width / 2, x + width / 4, x + 3 * (width / 4)}, //X points
                      new int[]{y + height/10 + height/4, y + height - height/10, y + height - height/10}, 3); //Y points
    }

    @Override
    public void move(int x, int y) {

    }
}
