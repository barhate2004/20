package main
import "fmt"
func swap(a,b *int){
	*a,*b=*b,*a
}
func main(){
	var x,y int
	fmt.Println("enter x number:")
	fmt.Scan(&x)
	fmt.Println("enter y number:")
	fmt.Scan(&y)

	fmt.Println("before swapping x:",x,"y:",y)
	swap(&x,&y)
	fmt.Println("after swapping x:",x,"y:",y)
}