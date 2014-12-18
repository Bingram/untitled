import java.awt.*;

/**
 * Created by Brian on 12/17/2014.
 */
public class Object {

    private int SPEED = 1;//Movement speed, number of pixels to move

    private Point centerBase;//Center of object bottom
    private Point centerMiddle;//Exact center of object
    private Point leftTop;//Top left point for Java orientation

    private int weight;//Weight/mass of object

    private String type;//Group this object belongs to

    private Rectangle outLine;//Area/edges of object as a rectangle

    private Point[][] shadow;//Use for collision detection

    public Object(){

    }

    public Object(Rectangle theRectangle, String theType, int theWeight){

        outLine = theRectangle;
        weight = theWeight;
        type = theType;

        setPoints();
    }

    private void setPoints() {

        //Move center base to rectangle centerX and to height
        //height should be the relative bottom in Java
        //but will not be relative to game screen
        centerBase.move((int)outLine.getCenterX(),outLine.height);
    }


    public void moveLeft(){
        centerBase.translate(SPEED,0);
        correctPoints(-SPEED, "HORIZONTAL");
    }

    public void moveRight(){
        centerBase.translate(SPEED,0);
        correctPoints(SPEED, "HORIZONTAL");

    }

    //In Java moving up means going down in Y coords
    public void moveUp(){
        centerBase.translate(0,-SPEED);
        correctPoints(-SPEED, "VERTICAL");
    }

    //In Java moving down means going up in Y coords
    public void moveDown() {
        centerBase.translate(0,SPEED);
        correctPoints(SPEED, "VERTICAL");
    }



    private void correctPoints(int dist, String direct ) {


        if(direct.equals("HORIZONTAL")){//movment on X-axis
            centerMiddle.translate(dist, 0);
            leftTop.translate(dist, 0);
        } else if (direct.equals("VERTICAL")){//Movement on Y-axis
            centerMiddle.translate(0, dist);
            leftTop.translate(0, dist);
        }

    }



}
