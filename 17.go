package main
import "fmt"

func calculate(a int ,b int)(int ,int,int,int){
	sum:=a+b
	subtarction:=a-b
	multiply:=a*b
	divide:=a/b

	return sum,subtarction,multiply,divide
}
func main(){
	var num1,num2 int
	fmt.Println("enter first number:")
	fmt.Scan(&num1)
	fmt.Println("enter second number:")
	fmt.Scan(&num2)

	sum,subtarction,multiply,divide:=calculate(num1,num2)
	fmt.Println("sum",sum)
	fmt.Println("subtarction",subtarction)
	fmt.Println("multiply",multiply)
	fmt.Println("divide",divide)
}