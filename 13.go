package main
import "fmt"

func main(){
	even,odd:= 0,0

	for i:=0;i<=100;i++{
		if(i%2==0){
			even+=i
		} else{
			odd+=i
		}
	}
	fmt.Println("sumof all Even between 1to100 :",even,"\nsumof all odd between 1to100:",odd)
}