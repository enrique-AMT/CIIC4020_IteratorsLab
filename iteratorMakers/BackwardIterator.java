package iteratorMakers;

import java.util.Iterator;

import positionInterfaces.PositionList;
import positionInterfaces.PositionListIteratorMaker;
import positionListLLDirect.PositionListElementsBackwardsIterator;

public class BackwardIterator<E> implements PositionListIteratorMaker<E> {
	@Override
	public Iterator<E> makeIterator(PositionList<E> pl) {
		// TODO Auto-generated method stub
		return new PositionListElementsBackwardsIterator<E>(pl);
	}

}
