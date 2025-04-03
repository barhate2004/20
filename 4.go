package main
import "fmt" 
func sumofdigit(n int) int{
	if n==0{
		return 0
	}
	return n%10 + sumofdigit(n/10)
}

func main(){
	var n int 
	fmt.Println("Enter a number")
	fmt.Scan(&n)

	sum:=sumofdigit(n)
fmt.Println("sum of digit of",n);
}