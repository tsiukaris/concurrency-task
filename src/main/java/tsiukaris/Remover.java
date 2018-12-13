package tsiukaris;

public class Remover extends Thread {
    private MyCollection myCollection;
    Remover(String name, MyCollection myC){
        super(name);
        myCollection = myC;
    }

    public void run(){
        //wait 10 seconds at the beginning to have some values in the MyCollection already
        try{
            sleep(10000);
            while(true){
                try {
                    sleep(5000);
                    myCollection.removeMinNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (InterruptedException i){
            i.printStackTrace();
        }

    }
}
