import java.util.ArrayList;

/**
 * Created by Brian on 12/17/2014.
 */
public class Environment {

    private Double GRAVITY = 9.81;

    private ArrayList<Object> myObjects;

    public Environment(){
        myObjects = new ArrayList<Object>();
    }


    /**
     * Goes through list of objects, moving
     */
    public void downForce(){
        for(Object o: myObjects){
            if(!o.isStatic()) {
                o.moveDown();
            }
        }
    }

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
