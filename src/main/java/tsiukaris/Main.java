package tsiukaris;


public class Main {

    public static void main(String[] args) {
        MyCollection myC = new MyCollection();

        Reader reader = new Reader("reader", myC);
        reader.start();
        Remover remover = new Remover("remover", myC);
        remover.start();

    }
}
