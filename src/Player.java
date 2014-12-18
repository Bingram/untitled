/**
 * Created by Brian on 12/17/2014.
 */
public class Player {

    private String myName;

    private Character myCharacter;

    public Player(){

        myName = "";

        myCharacter = new Character();

    }

    public Player(String name){
        myName = name;
    }

    public Player(String name, Character theChar){
        myName = name;

        myCharacter = theChar;
    }
}
