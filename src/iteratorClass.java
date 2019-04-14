//Iterator Class

public class iteratorClass implements iterator {

    private int current_index; // index value of current item in array
    private aggregator list; // reference to aggregator iterating over

    public iteratorClass(aggregator list, int start_loc) {
        current_index = start_loc;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return current_index < list.size;
    }

    @Override
    public int next() {
        if (!hasNext())
            return -1;
        return list.list[current_index++];
    }

}