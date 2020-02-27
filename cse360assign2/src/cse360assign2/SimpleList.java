/* 
 * Name: James Cook
 * Class ID: 167
 * Assignment: 1
*/

/**
 * SimpleList Class containing an integer array and integer count.
 */

package cse360assign2;

public class SimpleList {
	// int array list
	private int[] list;
	// count to hold number of ints in intArray
	private int count;
	
	/**
	 * Class Constructor.
	 */
	
	public SimpleList() {
		// int array size 10
		this.list = new int[10];
		this.count = 0;
	}
	
	
	/**
	 * Function to add int listElement to listArray
	 */

	public void add(int listElement) {
		// iterate backward through list, moving elements forward
		for(int listIndex = this.count; listIndex> 0; listIndex--) {
			// if listIndex= 10, don't move elements forward
			if(listIndex != 10) {
				this.list[listIndex] = this.list[listIndex-1];
			}
		}
		// insert listElement at beginning of list
		this.list[0] = listElement;
		if(this.count < 10) {
			count++;
		}
	}
	
	/**
	 * Function to remove int listElement from listArray
	 */
	public void remove(int listElement) {
		// search and obtain position of listElement
		int arrayLocation = this.search(listElement);
		// if search found position of element remove it
		if(arrayLocation >= 0) {
			// starting at position of listElement, up to count, move elements backward in list
			for(int listIndex = arrayLocation; listIndex < this.count; listIndex++) {
				this.list[listIndex] = this.list[listIndex+1];
			}
			// decrement count
			this.count--;
		}
	}
	
	/**
	 * Function to return count
	 */
	public int count() {
		return this.count;
	}
	
	/**
	 * Function to output list as string, space separated 
	 */
	public String toString() {
		String intList = "";
		for(int listIndex = 0; listIndex < this.count; listIndex++) {
			intList += this.list[listIndex];
			if(listIndex != count-1) {
				intList += " ";
			}
		}
		return intList;
	}
	
	/**
	 * Function to search list for int listElement
	 */
	public int search(int listElement) {
		// set int arrayLocation to -1
		int arrayLocation = -1;
		// iterate through list to find listElement
		for(int listIndex = 0; listIndex < this.count; listIndex++) {
			if(this.list[listIndex] == listElement) {
				arrayLocation = listIndex;
				return arrayLocation;
			}
		}
		// Return indelistElement of array if found, else return -1 for not found
		return arrayLocation;
	}
	
}
