package States;

import Handler.Handler;

import java.awt.*;

public class MenuState extends State {

    public MenuState(Handler handler) {
        super(handler);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, handler.getWidth(), handler.getHeight());
    }
}
