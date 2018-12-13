package tsiukaris;

import java.util.Scanner;

public class Reader extends Thread {
    private MyCollection myCollection;
    Reader(String name, MyCollection myCollection){
        super(name);
        this.myCollection = myCollection;
    }

    public void run(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            myCollection.addNumber(NumeralParser.replaceNumbers(scanner.nextLine()));
        }
    }
}
