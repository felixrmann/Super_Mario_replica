package MarioRipoff.Model.Player;

import MarioRipoff.Model.Position;

/**
 * The type Player.
 *
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 27
 */
public class Player {

    //BlockPosition: position of Block (mapHeight: 10, mapWidth: mapWidth from file)
    Position blockPos;
    //PixelPosition: position of Pixel in Block (0 - 15) or (1 - 16)
    Position pixelPos;
    //SubpixelPosition: position of Subpixel in Pixel (depends on pixelSize (in config file))
    Position subPixelPos;

    /**
     * Instantiates a new Player.
     * @param blockPosY the block pos y
     * @param blockPosX the block pos x
     */
    public Player(int blockPosY, int blockPosX){
        this.blockPos = new Position(blockPosY, blockPosX);
        this.pixelPos = new Position(0,7);
        this.subPixelPos = new Position(0,0);
    }

    /**
     * Gets block pos.
     * @return the block pos
     */
    public Position getBlockPos() {
        return blockPos;
    }

    /**
     * Gets pixel pos.
     * @return the pixel pos
     */
    public Position getPixelPos() {
        return pixelPos;
    }

    /**
     * Gets sub pixel pos.
     * @return the sub pixel pos
     */
    public Position getSubPixelPos() {
        return subPixelPos;
    }

    /**
     * Move up.
     */
    public void moveUp(){
        //TODO
    }

    /**
     * Move right.
     */
    public void moveRight(){
        //TODO
    }

    /**
     * Move down.
     */
    public void moveDown(){
        //TODO
    }

    /**
     * Move left.
     */
    public void moveLeft(){
        //TODO
    }
}
