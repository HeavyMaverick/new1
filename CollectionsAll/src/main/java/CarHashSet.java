public class CarHashSet implements CarSet {
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Entry[] array = new Entry[INITIAL_CAPACITY];

    private int getElementPosition(Car car, int arrayLength) {
        return Math.abs(car.hashCode() % arrayLength);
    }

    @Override
    public boolean add(Car car) {
        if(size >= array.length * LOAD_FACTOR){
            increaseArray();
        }
        boolean added = add(car, array);
        if(added){
            size++;
        }
        return added;
    }

    private boolean add(Car car, Entry[] destination) {
        int position = getElementPosition(car, destination.length);
        if (destination[position] == null) {
            Entry entry = new Entry(car, null);
            destination[position] = entry;
            return true;
        } else {
            Entry existedElement = destination[position];
            while (true) {
                if (existedElement.value.equals(car)) {
                    return false;
                } else if (existedElement.next == null) {
                    existedElement.next = new Entry(car, null);
                    return true;
                } else {
                    existedElement = existedElement.next;
                }
            }
        }
    }

    @Override
    public boolean remove(Car car) {
        int position = getElementPosition(car, array.length);
        if (array[position] == null) {
            return false;
        }
        Entry preLast = array[position];
        Entry last = preLast.next;
        while (last != null) {
            if (preLast.value.equals(car)) {
                array[position] = last;
                size--;
                return true;
            }
            if (last.value.equals(car)) {
                preLast.next = last.next;
                size--;
                return true;
            } else {
                preLast = last;
                last = last.next;
            }
        }
        return false;
    }

    private void increaseArray() {
        Entry[] newArray = new Entry[array.length * 2];
        for(Entry entry : array){
            Entry existingElement = entry;
            while (existingElement != null){
                add(existingElement.value, newArray);
                existingElement = existingElement.next;
            }
        }
        array = newArray;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    private static class Entry {
        private Car value;
        private Entry next;

        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
