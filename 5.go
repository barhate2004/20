package main

import (
	"fmt"
	"os"
)
func main(){

	er:=os.WriteFile(("text.txt"),[]byte("welcome to my world"),0644)
     if(er!=nil){
		fmt.Println("error",er)
	 }
	 fmt.Println("file is created")

	 context,er:=os.ReadFile("text.txt")
	 if(er!=nil){
		fmt.Println("error",er)
	 }
	 fmt.Println("file is read")
	 fmt.Println(string(context))
}
