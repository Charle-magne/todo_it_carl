package se.lexicon.carl.data;

public class PersonSequencer {

    private static int personID = 0;

    static int nextPersonID(){
        personID++;
        return personID;
    }

    static void reset(){
        personID = 0;
    }
}
