package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearch) {

		// Sorting
		int[] sortNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		// searching business logic 
		
		// return numberToSearch
		return 3;

	}

}
