package main
import "fmt"

type anytype interface{ }
func display(value anytype){
	switch v:=value.(type){
	case int:
		fmt.Println("integer value is: ",v)
	case float64:
		fmt.Println("float value : ",v)
	case string:
		fmt.Println("string value : ",v)
	case bool:
		fmt.Println("boolean value: ",v)
	
	default:
		fmt.Println("unknown type")
	} 
}
func main(){
	var x anytype

	x=42
	display(x)
	x = 3.14
	display(x)
	x="ayush"
	display(x)
	x=true
	display(x)
}