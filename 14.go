package main

import (
	"fmt"
)

func remove(slice []int, s int) []int {
	return append(slice[:s], slice[s+1:]...)
}

func copySlice(original []int) []int {
	copied := make([]int, len(original))
	copy(copied, original)
	return copied
}

func main() {
	numbers := []int{1, 2, 3, 4, 5}
	fmt.Println("Original slice:", numbers)

	numbers = append(numbers, 6, 7, 8)
	fmt.Println("After appending 6, 7, 8:", numbers)

	numbers = remove(numbers, 2)
	fmt.Println("After removing element at index 2:", numbers)

	copiedNumbers := copySlice(numbers)
	fmt.Println("Copied slice:", copiedNumbers)

	numbers[0] = 100
	fmt.Println("After modifying original slice:", numbers)
	fmt.Println("Copied slice remains unchanged:", copiedNumbers)

	subSlice := numbers[1:4]
	fmt.Println("Sub-slice from index 1 to 3:", subSlice)

	fmt.Println("Length of original slice:", len(numbers))
	fmt.Println("Capacity of original slice:", cap(numbers))
}