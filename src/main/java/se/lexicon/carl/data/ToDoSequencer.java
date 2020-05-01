package se.lexicon.carl.data;

public class ToDoSequencer {

    private static int toDoID = 0;

    static int nextToDoID(){
        toDoID++;
        return toDoID;
    }

    static void reset(){
        toDoID = 0;
    }
}
