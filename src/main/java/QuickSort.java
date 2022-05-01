import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hands-on implementation for quicksort algorithm.
 */
public class QuickSort {

	/**
	 * Given an array of unsorted integers, returns a sorted array.
	 *
	 * @param input The unsorted array of integers.
	 * @return The sorted array.
	 */
	public static List<Integer> sort(List<Integer> input) {
		if (input.size() < 2)
			return input;

		int pivot = input.get((input.size() - 1) / 2);
		List<Integer> less = input.stream().filter(x -> x < pivot).collect(Collectors.toList());
		List<Integer> greater = input.stream().filter(x -> x > pivot).collect(Collectors.toList());
		List<Integer> all = new ArrayList<>(sort(less));
		all.add(pivot);
		all.addAll(sort(greater));
		return all;
	}
}
