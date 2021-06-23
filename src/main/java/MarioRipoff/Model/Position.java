package MarioRipoff.Model;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 22
 */

public class Position {

    private char blockShort;
    private int yPosition, xPosition;

    public Position(char blockShort, int yPosition, int xPosition){
        this.blockShort = blockShort;
        this.yPosition = yPosition;
        this.xPosition = xPosition;
    }

    public void setBlockShort(char blockShort) {
        this.blockShort = blockShort;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public char getBlockShort() {
        return blockShort;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }
}
