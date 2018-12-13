package tsiukaris;

import java.util.NoSuchElementException;
import java.util.TreeSet;

public class MyCollection {
    private final TreeSet<Integer> treeSet = new TreeSet<>();

    public synchronized void addNumber(int number){
        treeSet.add(number);
    }

    public synchronized void removeMinNumber(){
        try{
            if(treeSet.first() != null){
                System.out.println(String.valueOf(treeSet.first()));
                treeSet.remove(treeSet.first());

            } else {
                System.out.println("No available numbers for removing");
            }
        } catch (NoSuchElementException n ){
            System.out.println("No elements left");
        }

    }
}
