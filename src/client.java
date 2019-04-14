import java.util.Random;

public class client {

    public static void main(String[] args) {

        //Create an object of the collection class
        aggregator ag = new aggregator(20);

        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            //Add an item to the collection
            ag.add(rand.nextInt(100));
        }

        // Get an iterator interface instance by calling the collections method that returns the iterator interface object
        iterator itr = ag.itr();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
