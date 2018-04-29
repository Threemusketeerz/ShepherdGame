import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{
    private final int WIDTH = 800, HEIGHT = 600;

    private Board board;
    private Shepherd shepherd;

    public GameFrame()
    {
        board = new Board("/maps/map1.png");
        shepherd = new Shepherd(board);

        initWindow("Shepherd");
//        paintComponents(board.getGraphics());
    }

    private void initWindow(String title)
    {
        JPanel gamePanel = shepherd.getCamera();
        gamePanel.setLayout(null);
        gamePanel.setLocation(0, 0);
        add(gamePanel);

        pack();

        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            GameFrame frame = new GameFrame();
            frame.setVisible(true);
        });
    }
}
