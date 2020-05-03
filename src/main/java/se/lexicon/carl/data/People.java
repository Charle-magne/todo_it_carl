package se.lexicon.carl.data;
import se.lexicon.carl.model.Person;

public class People {

    private static Person[] array1 = new Person[0];

    public int size(){
        return array1.length;
    }

    public Person[] findAll(){
        return array1;
    }

    public Person findById(int personID){
        return array1[personID];
    }


}
