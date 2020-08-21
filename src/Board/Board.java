package Board;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Board {

    private int x, y, tileWidth, tileHeight, numTileWidth, numTileHeight;
    private Tile[][] tiles;

    public Board(int x, int y, int tileWidth, int tileHeight, int numTileWidth, int numTileHeight, Color color1, Color color2) {
        this.x = x;
        this.y = y;
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.numTileWidth = numTileWidth;
        this.numTileHeight = numTileHeight;
        tiles = new Tile[numTileWidth][numTileHeight];
        boolean swap = true;
        for (int i = 0; i < tiles.length; i++) {
            swap = !swap;
            for (int j = 0; j < tiles.length; j++) {
                if (swap) {
                    tiles[i][j] = new Tile(x + (i * tileWidth), y + (j * tileHeight), tileWidth, tileHeight, color1);
                    swap = !swap;
                } else {
                    tiles[i][j] = new Tile(x + (i * tileWidth), y + (j * tileHeight), tileWidth, tileHeight, color2);
                    swap = !swap;
                }
            }
        }
    }

    public void tick() {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].tick();
            }
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].render(g);
            }
        }
    }

    public void renderHovering(Graphics g) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].renderHovering(g);
            }
        }
    }

    public void onMouseMove(MouseEvent e) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j].onMouseMove(e);
            }
        }
    }
}
