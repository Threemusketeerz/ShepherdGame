import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Shepherd
{
    private int x, y;
    private final int width = 200, height = 200;
    private BufferedImage image;
    private Camera camera;
    private Board board;

    public Shepherd(Board board)
    {
        this.x = board.getW() / 2;
        this.y = board.getY() / 2;
        camera = new Camera(x, y, board.getW(), board.getH(),
                800,800, board);
    }

    public Shepherd(int x, int y, Board board)
    {
        this.x = x;
        this.y = y;
        this.board = board;
//        camera = new Camera(x, y, board.getW(), board.getH());
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Image getImage() { return image; }
    public Board getBoard() { return board; }
    public Camera getCamera() { return camera; }

}
