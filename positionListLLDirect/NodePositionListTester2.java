package positionListLLDirect;

import java.util.Iterator;

import exceptionClasses.EmptyListException;
import iteratorMakers.BackwardIterator;
import positionInterfaces.Position;

public class NodePositionListTester2 {
	

	public static void main(String[] args) {
		BackwardIterator<Integer> maker1 = new BackwardIterator<>();
		
		NodePositionList2<Integer> w = new NodePositionList2<Integer> (maker1); 
		NodePositionList2<Integer> q = new NodePositionList2<Integer> (); 
		q.addFirst(10); 
		
		w.addFirst(5); 
		w.addFirst(3); 
		
		w.addLast(10); 
		w.addLast(13); 
		try {
			Position<Integer> p = w.first();
			w.addAfter(p, 2); 
			p = w.next(p); 
			w.addAfter(p, 34); 
			w.addBefore(p, 40); 
			//p = q.first(); 
			w.addAfter(p, 89); 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		showElements(w); 

	}

	private static <E> void showElements(NodePositionList2<E> w) {
		for(E p : w) 
			System.out.println(p); 
	}
	
	

}
