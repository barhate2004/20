package main
import "fmt"

func main(){
	var n int 
	fmt.Println("enter number: ")
	fmt.Scan(&n)

	if n<=0{
		fmt.Println("enter number greater than 0")
	}

	 fmt.Println("fibonacci series:")
	 a,b:=0,1
	 for i:=1;i<=n;i++{
		fmt.Println(a," ")
		next:=a + b
		a=b
		b=next
	 }
 
	 fmt.Println( )
}