package algorithms.mediem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

    private Iterator<Integer> it;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList<>();
        load(list, nestedList);
        this.it = list.iterator();

    }

    @Override
    public Integer next() {
        return it.next();
    }

    private void load(List<Integer> list, List<NestedInteger> nestedList) {
        for (NestedInteger ni: nestedList) {
            if(ni.isInteger()) {
                list.add(ni.getInteger());
            } else {
                load(list, ni.getList());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

}
