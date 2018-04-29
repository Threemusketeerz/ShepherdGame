
public class Camera
{
    private int playerX, playerY;
    private int worldSizeW, worldSizeH;

    public Camera(int playerX, int playerY,
                  int worldSizeW, int worldSizeH)
    {
        this.playerX = playerX;
        this.playerY = playerY;
        this.worldSizeW = worldSizeW;
        this.worldSizeH = worldSizeH;
    }
}
