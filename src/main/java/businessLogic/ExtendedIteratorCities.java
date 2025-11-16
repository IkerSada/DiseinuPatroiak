package businessLogic;

import iterator.ExtendedIterator;
import java.util.Vector;
import java.util.NoSuchElementException;

public class ExtendedIteratorCities implements ExtendedIterator<String> {
    private Vector<String> cities;
    private int currentIndex;
    
    public ExtendedIteratorCities(Vector<String> cities) {
        this.cities = (cities != null) ? cities : new Vector<String>();
        this.currentIndex = 0;
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < cities.size();
    }
    
    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return cities.get(currentIndex++);
    }
    
    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }
    
    @Override
    public String previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException("No previous elements");
        }
        return cities.get(--currentIndex);
    }
    
    @Override
    public void goFirst() {
        currentIndex = 0;
    }
    
    @Override
    public void goLast() {
        currentIndex = cities.size();
    }
    
    // Remove method from Iterator interface (opcional)
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation not supported");
    }
}