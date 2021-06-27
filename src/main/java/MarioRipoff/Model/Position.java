package MarioRipoff.Model;

/**
 * This class is just a simple Object to save a X and a Y position in one Object. In addition you can also save a char
 * which is used in the blockMap
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 22
 */

public class Position {

    private char blockShort;
    private int yPosition, xPosition;

    /**
     * Instantiates a new Position.
     * @param yPosition the y position
     * @param xPosition the x position
     */
    public Position(int yPosition, int xPosition){
        this.yPosition = yPosition;
        this.xPosition = xPosition;
    }

    /**
     * Instantiates a new Position.
     * @param blockShort the block short
     * @param yPosition  the y position
     * @param xPosition  the x position
     */
    public Position(char blockShort, int yPosition, int xPosition){
        this.blockShort = blockShort;
        this.yPosition = yPosition;
        this.xPosition = xPosition;
    }

    /**
     * Sets block short.
     * @param blockShort the block short
     */
    public void setBlockShort(char blockShort) {
        this.blockShort = blockShort;
    }

    /**
     * Sets y position.
     * @param yPosition the y position
     */
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Sets x position.
     * @param xPosition the x position
     */
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Gets block short.
     * @return the block short
     */
    public char getBlockShort() {
        return blockShort;
    }

    /**
     * Gets y position.
     * @return the y position
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Gets x position.
     * @return the x position
     */
    public int getXPosition() {
        return xPosition;
    }
}
