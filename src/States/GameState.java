package States;

import Board.Board;
import GameObjects.GameObjectManager;
import GameObjects.Pawn;
import Handler.Handler;

import java.awt.*;

public class GameState extends State {

    private Board board;
    private GameObjectManager gameObjectManager;
    private Pawn pawn;

    public GameState(Handler handler) {
        super(handler);

        board = new Board(handler.getWidth()/2 - 320,0, 80,80, 8, 8, Color.LIGHT_GRAY, Color.GRAY);
        handler.getMouseManager().setBoard(board);
        gameObjectManager = new GameObjectManager(handler);

        pawn = new Pawn(board.getTiles()[0][1].getX(), board.getTiles()[0][1].getY(), board.getTiles()[0][1].getWidth(), board.getTiles()[0][1].getHeight(), Color.WHITE, handler);
        board.getTiles()[0][1].setPiece(pawn);
        gameObjectManager.addGameObject(pawn);


    }


    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, handler.getWidth(), handler.getHeight());

        board.render(g);

        gameObjectManager.render(g);

        board.renderHovering(g);
    }

    @Override
    public void tick() {

        board.tick();

        gameObjectManager.tick();
    }
}
