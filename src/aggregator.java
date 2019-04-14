//Collection class

public class aggregator {

    int[] list;
    int current = 0;
    int size;
    private static final int RANDOM_LIMIT = 100;

    public aggregator(int size) // constructor
    {
        list = new int[size];
        this.size = size; //initiating size
    }

    public void add(int randomNim)
    {
        list[current] = randomNim;
        current++;
    }

    //factory method for iteratorClass class that returns an iterator interface object
    public iterator itr() {
        iterator listItr = new iteratorClass(this, 0);
        return listItr;
    }

}