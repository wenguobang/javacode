package com.wgb.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.Test;

public class CollectionTest {
	@Test
	public void test1() {
		Collection coll = new ArrayList();
		Collection coll1 = new  LinkedList();
		Collection cool2 = new Vector();
		Collection coll3 = new  HashSet();
		Collection coll4 = new LinkedHashSet();
		Iterator it = coll.iterator();
	}

}
