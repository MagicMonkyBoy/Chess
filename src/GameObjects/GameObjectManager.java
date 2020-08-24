package GameObjects;

import Handler.Handler;
import States.State;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GameObjectManager {
    ArrayList<Pieces> pieces;
    Handler handler;

    public GameObjectManager (Handler handler) {
        this.handler = handler;
        pieces = new ArrayList<Pieces>();
    }

    public void tick() {
        for (Pieces go : pieces) {
            go.tick();
        }
    }

    public void render(Graphics g) {
        for (Pieces go : pieces) {
            go.render(g);
        }
    }

    public void addGameObject(Pieces gameObject) {
        pieces.add(gameObject);
    }

    public void removeGameObject(Pieces gameObject) {
        pieces.remove(gameObject);
    }

//    public void onMouseMove(MouseEvent e) {
//        for (Pieces go : gameObjects) {
//            if (go.state == State.getState()) {
//                go.onMouseMove(e);
//                //System.out.println("YA YA YA ");
//            }
//        }
//    }

    public ArrayList<Pieces> getGameObjects() {
        return pieces;
    }
}
