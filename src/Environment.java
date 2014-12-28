import java.util.ArrayList;

/**
 * Created by Brian on 12/17/2014.
 */
public class Environment {

    private ArrayList<Object> myObjects;

    public Environment(){
        myObjects = new ArrayList<Object>();
    }


    /**
     * ***DEPRECIATED****
     * Goes through list of objects, moving
     *
     * Original idea was to make sure all objects were constantly moving down
     * in order to simulate gravity, but this should be handled on a per object
     * basis as a change in the Y acceleration value
     */
    /*public void downForce(){
        for(Object o: myObjects){
            if(!o.isStatic()) {
                o.moveDown();
            }
        }
    }*/

    public ArrayList<Object> getMyObjects() {
        return myObjects;
    }

    public void setMyObjects(ArrayList<Object> myObjects) {
        this.myObjects = myObjects;
    }

    private class Collider{
        public Collider(){

        }
    }


}
