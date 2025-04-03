package main
import"fmt"

func main(){
	var n int
	fmt.Println("enter number: ")
	fmt.Scanf("%d",&n)
	
	if n>=10&&n<=99||n<=-10&&n>=-99{
		fmt.Printf("number is two digit:%d",n)
	}else{
		fmt.Printf("number is not two digit:%d",n)
	}
}