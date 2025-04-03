package main
import "fmt"
func table(num int) {
	fmt.Println("multiplicaion table ",num)
	for i:=1;i<=10;i++{
		fmt.Printf("%d X %d=%d\n",num,i,num*i)
		
	}
}
func main(){
	var number int 
	fmt.Println("enter number:")
	fmt.Scanf("%d",&number)
    table(number)
}