package ra.dev;
import java.util.Arrays;
import java.util.Objects;

public class List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Objects[] elements;

    public List() {
        elements = new Objects[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add( E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = (Objects) e;
    }
    public E get(int i){
        if(i>= size || i<0){
            throw new IndexOutOfBoundsException("INdex : " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
