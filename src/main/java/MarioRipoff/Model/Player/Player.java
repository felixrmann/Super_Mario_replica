package MarioRipoff.Model.Player;

import MarioRipoff.Loader.ConfigLoader;
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
    private Position blockPos;
    //PixelPosition: position of Pixel in Block (0 - 15) or (1 - 16)
    private Position pixelPos;
    //SubpixelPosition: position of Subpixel in Pixel (depends on pixelSize (in config file))
    private Position subPixelPos;

    private int pixelSizeMinOne;

    /**
     * Instantiates a new Player.
     * @param blockPosY the block pos y
     * @param blockPosX the block pos x
     */
    public Player(int blockPosY, int blockPosX){
        this.blockPos = new Position(blockPosY, blockPosX);
        this.pixelPos = new Position(0,7);
        this.subPixelPos = new Position(0,0);

        pixelSizeMinOne = ConfigLoader.getPixelSize() - 1;
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
        if (subPixelPos.getYPosition() == pixelSizeMinOne){
            if (pixelPos.getYPosition() == 15){
                blockPos.addYPosition();
                pixelPos.setYPosition(0);
                subPixelPos.setYPosition(0);
            } else {
                subPixelPos.setYPosition(0);
                pixelPos.addYPosition();
            }
        } else {
            subPixelPos.addYPosition();
        }
    }

    /**
     * Move right.
     */
    public void moveRight(){
        if (subPixelPos.getXPosition() == pixelSizeMinOne){
            if (pixelPos.getXPosition() == 15){
                blockPos.addXPosition();
                pixelPos.setXPosition(0);
                subPixelPos.setXPosition(0);
            } else {
                subPixelPos.setXPosition(0);
                pixelPos.addXPosition();
            }
        } else {
            subPixelPos.addXPosition();
        }
    }

    /**
     * Move down.
     */
    public void moveDown(){
        if (subPixelPos.getYPosition() == 0){
            if (pixelPos.getYPosition() == 0){
                blockPos.removeYPosition();
                pixelPos.setYPosition(15);
                subPixelPos.setYPosition(pixelSizeMinOne);
            } else {
                subPixelPos.setYPosition(pixelSizeMinOne);
                pixelPos.removeYPosition();
            }
        } else {
            subPixelPos.removeYPosition();
        }
    }

    /**
     * Move left.
     */
    public void moveLeft(){
        if (subPixelPos.getXPosition() == 0){
            if (pixelPos.getXPosition() == 0){
                blockPos.removeXPosition();
                pixelPos.setXPosition(15);
                subPixelPos.setXPosition(pixelSizeMinOne);
            } else {
                subPixelPos.setXPosition(pixelSizeMinOne);
                pixelPos.removeXPosition();
            }
        } else {
            subPixelPos.removeXPosition();
        }
    }

    //TODO delete
    public void printPlayerInfo(){
        System.out.println("Block   : Y: " + blockPos.getYPosition() + ", X: " + blockPos.getXPosition());
        System.out.println("Pixel   : Y: " + pixelPos.getYPosition() + ", X: " + pixelPos.getXPosition());
        System.out.println("SubPixel: Y: " + subPixelPos.getYPosition() + ", X: " + subPixelPos.getXPosition());
    }
}
