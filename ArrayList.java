public class ArrayList<E> implements List<E>{ 
    public static final int CAPACITY = 16; 
    private E[] data; 
    private int size = 0; 

    public ArrayList() {this(CAPACITY);}
    public ArrayList(int capacity){
        data = (E[]) new Object[capacity]; 
    }

    public int size() { return size; }
    public boolean isEmpty{return size == 0;}
    public E get(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size); 
        return data[i];
    }

    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException{
        checkIndex(i, size + 1); 
        if (size == data.length){
            resize(2 * data.length);

        for(int k = size - 1; k >= i; k--){
            data[k + 1] = data[k]; 
        }
        data[i] = e; 
        size++; 
    }
}

    public void E remove(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size)
        E temp = data[i]
        for(int k = i; k < size - 1; k++){
            data[k] = data[k + 1]; 
        }
        data[size - 1] = null; 
        size--; 
        return temp;         
    }

    protected void resize(int capactiy){
        E[] temp = (E[]) new Object[capactiy]; 
        for(int k = 0; k < size; k++){
            temp[k] = data[k]; 
        }
        data = temp; 
    }
}

