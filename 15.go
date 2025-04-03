package main
import "fmt"

func main(){
	 var num1,num2 int
	 fmt.Println("enter first number:")
	 fmt.Scan(&num1)

	 fmt.Println("enter second number:")
	 fmt.Scan(&num2)

	 sum,product:=calculate(num1,num2);

	 fmt.Println("sum",sum)
	 fmt.Println("product",product)
}

func calculate(a int ,b int )(int,int){
	sum:=a+b
	product:=a*b
	return sum,product
}