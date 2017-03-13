package positionInterfaces;
import java.util.Iterator;

public interface PositionListIteratorMaker<T> { 
     Iterator<T> makeIterator(PositionList<T> pl); 
} 
