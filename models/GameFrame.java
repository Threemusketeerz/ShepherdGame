import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{
    private final int WIDTH = 800, HEIGHT = 600;

    private Board board;

    public GameFrame()
    {
        board = new Board("/maps/map1.png");
        initWindow("Shepherd");
//        paintComponents(board.getGraphics());
    }

    private void initWindow(String title)
    {
        add(board);

        pack();

        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            GameFrame frame = new GameFrame();
            frame.setVisible(true);
        });
    }
}
