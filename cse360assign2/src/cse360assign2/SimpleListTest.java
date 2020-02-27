// Name: James Cook
// Class ID: 167
// Assignment: 1

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	// Test SimpleList() constructor
	@Test
	void testConstructor() {
		SimpleList testList = new SimpleList();
		assertEquals(0, testList.count());
		assertNotNull(testList);
	}
	
	
	// Test count() function
	@Test
	void testCount() {
		SimpleList testList = new SimpleList();
		assertEquals(0, testList.count());
	}
	
	
	// Test add() function (3 ints)
	@Test
	void testAdd() {
		SimpleList testList = new SimpleList();
		testList.add(6);
		assertEquals(1, testList.count());
		testList.add(5);
		assertEquals(2, testList.count());
		testList.add(4);
		assertEquals(3, testList.count());
	}
	
	// Test toString() function
	@Test
	void testToString() {
		SimpleList testList = new SimpleList();
		testList.add(6);
		testList.add(5);
		testList.add(4);
		assertEquals("4 5 6",testList.toString());
	}
	
	// Test removeDuplicate() function
	@Test
	void testRemoveMiddleCount() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		// Remove first occurrence of 2
		testList.remove(2);
		assertEquals(2,testList.count());
	}

	// Test removeDuplicate() function
	@Test
	void testRemoveMiddleString() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		// Remove first occurrence of 2
		testList.remove(2);
		assertEquals("3 1",testList.toString());
	}	
	
	
	// Test search() function
	@Test
	void testSearch1() {
		SimpleList testList = new SimpleList();
		testList.add(0);
		testList.add(1);
		testList.add(0);
		testList.add(3);
		testList.add(0);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		// Return first incident of 0
		assertEquals(-1,testList.search(10));
	}
	
	// Test search() function
	@Test
	void testSearch2() {
		SimpleList testList = new SimpleList();
		testList.add(0);
		testList.add(1);
		testList.add(0);
		testList.add(3);
		testList.add(0);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		// Return first incident of 10 (doesn't exist)
		assertEquals(-1,testList.search(10));
	}
	
	// Test overFlow count		
	@Test
		void testCountOverflow() {
			SimpleList testList = new SimpleList();
			testList.add(0);
			testList.add(1);
			testList.add(0);
			testList.add(3);
			testList.add(0);
			testList.add(5);
			testList.add(6);
			testList.add(7);
			testList.add(8);
			testList.add(9);
			testList.add(10);
			// Return first incident of 10 (doesn't exist)
			assertEquals(10,testList.count());
		}	
	
	// Test overFlow toString		
	@Test
		void testToStringOverflow() {
			SimpleList testList = new SimpleList();
			testList.add(0);
			testList.add(1);
			testList.add(2);
			testList.add(3);
			testList.add(4);
			testList.add(5);
			testList.add(6);
			testList.add(7);
			testList.add(8);
			testList.add(9);
			assertEquals("9 8 7 6 5 4 3 2 1 0", testList.toString());
			testList.add(10);
			// Return first incident of 10 (doesn't exist)
			assertEquals("10 9 8 7 6 5 4 3 2 1",testList.toString());
		}		

	// Test removeDuplicate() function
	@Test
	void testSearchDuplicate() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(4);
		testList.add(2);
		// Search for first occurrence of 2
		assertEquals(0,testList.search(2));
	}		
	
	
	// Test removeDuplicate() function
	@Test
	void testRemoveDuplicate() {
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(4);
		testList.add(2);
		// Remove first occurrence of 2
		testList.remove(2);
		assertEquals("4 2 1",testList.toString());
	}
	

}
