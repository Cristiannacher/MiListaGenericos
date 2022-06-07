package List;

import Exceptions.ObjectNotfoundException;
import List.Element;

public class MiLista<T>{

    private Element<T> firstElement;

    public MiLista() {
        this.firstElement = null;
    }

    public void insertFirst(T obj) {
        Element<T> newElement = new Element<>(obj);
        newElement.setNext(firstElement);
        firstElement = newElement;
    }

    public void insert(T object) {
        Element<T> newElement = firstElement;
        if (newElement == null) {
            firstElement = new Element<T>(object);
        } else {
            while (newElement.getNext() != null) {
                newElement = newElement.getNext();
            }
            newElement.setNext(new Element<T>(object));
        }
    }



    public void print() {
        Element<T> toGetObject = firstElement;

        if (firstElement != null) {
            while (toGetObject != null) {
                System.out.print(toGetObject.getObjet() + " ");
                toGetObject = toGetObject.getNext();
            }
            System.out.println();
        } else System.out.println("La lista esta vacia");
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public void remove(T obj) throws ObjectNotfoundException {
        Element<T> toGetObject = firstElement;
        Element<T> toGetNext = firstElement.getNext();
        if (firstElement != null) {
            if (firstElement.getObjet().equals(obj)) {
                firstElement = firstElement.getNext();
            } else {
                while (toGetNext != null) {
                    if (toGetNext.getObjet().equals(obj)) {
                        toGetObject.setNext(toGetNext.getNext());
                        break;
                    } else {
                        toGetNext = toGetNext.getNext();
                        toGetObject = toGetObject.getNext();
                    }
                }
            }
        } else throw new ObjectNotfoundException();
    }

    public T getFirstElemnet() {
        if (firstElement != null) {
            return firstElement.getObjet();
        } else {
            System.out.println("La lista esta vacia");
            return null;
        }
    }

    public T getLastElement() {
        Element<T> last = firstElement;

        while (last.getNext() != null) {
            last = last.getNext();
        }
        return last.getObjet();
    }

    public T getObjectAtPosition(int i) {
        int contador = 0;
        Element<T> toGet = firstElement;
        while (toGet != null) {
            if (contador == i) {
                return toGet.getObjet();
            }
            toGet = toGet.getNext();
            contador++;
        }
        return null;
    }
}
