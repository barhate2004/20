package main

import "fmt"

func main() {
	var num1, num2, n int

	fmt.Print("enter num1")
	fmt.Scanf("%d ", &num1)
	fmt.Print("enter num2")
	fmt.Scanf("%d ", &num2)

	fmt.Println("enter choice 1.addidtion 2.subtratction 3.multiplication 4.division:")
	fmt.Scanf("%d", &n)

	switch n {

	case 1:
		fmt.Println("addition of num1 and num 2", num1+num2)

	case 2:
		fmt.Println("subtaraction of num1 and num 2:", num1-num2)

	case 3:
		fmt.Println("multiplication of num1 and num 2:", num1*num2)

	case 4:
		if num2 != 0 {
			fmt.Println("multiplication of num1 and num 2:", num1/num2)
		} else {
			fmt.Printf("error")
		}
	default:
		fmt.Print("invalid no ")
	}
}
