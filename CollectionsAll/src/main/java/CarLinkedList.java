public class CarLinkedList implements CarList {
    private static class Node {
        private Node previous;
        private Node next;
        private Car value;

        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public Car get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(Car car) {
        if (size == 0) {
            first = new Node(null, car, null);
            last = first;
        } else {
            Node preLast = last;
            last = new Node(preLast, car, null);
            preLast.next = last;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(Car car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            return add(car);
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Car car) {
        int index = findElement(car);
        if (index != -1) {
            return removeAt(index);
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }

        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Car car) {
        return findElement(car) != -1;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private Node getNode(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int findElement(Car car) {
        Node node = first;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(car)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }
}
