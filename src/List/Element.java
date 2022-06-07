package List;

public class Element<T> {

    private T object;
    private Element<T> next;

    public Element(T newObject){
        this.object = newObject;
    }

    public void setNext(Element<T> newNext){
        this.next = newNext;
    }

    public Element<T> getNext(){
        return next;
    }

    public T getObjet(){
        return object;
    }

    public void setObject(T newObject){
        this.object = newObject;
    }

    public void delete(){
        object = null;
        next = null;
    }

}