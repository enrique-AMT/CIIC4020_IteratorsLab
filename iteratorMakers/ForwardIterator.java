package iteratorMakers;

import java.util.Iterator;

import positionInterfaces.PositionList;
import positionInterfaces.PositionListIteratorMaker;
import positionListLLDirect.PositionListElementsIterator;

public class ForwardIterator<E> implements PositionListIteratorMaker<E> {

	@Override
	public Iterator<E> makeIterator(PositionList<E> pl) {
		// TODO Auto-generated method stub
		return new PositionListElementsIterator<E>(pl);
	}

}
