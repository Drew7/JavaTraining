package qpack;

public interface ICharQ {
    public void put(char ch) throws QueueFullException;
    public char get() throws QueueEmptyException;
    public void reset();
}