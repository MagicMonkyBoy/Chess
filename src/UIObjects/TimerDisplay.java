package UIObjects;

import Handler.Handler;

import java.awt.*;

public class TimerDisplay extends UIObjects {

    private Color color;

    public TimerDisplay(float x, float y, float width, float height, Color color, Handler handler) {
        super(x, y, width, height, handler);
        this.color = color;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.drawRect((int)x, (int)y, (int)width, (int)height);
        g.setFont(new Font());
    }
}
