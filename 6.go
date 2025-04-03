package main
import "fmt" 
func copyarray(arr1[]int)[]int{
	arr2:=make([]int,len(arr1))
    for i:=0;i<len(arr1);i++{
		arr2[i]=arr1[i]
	}
    return arr2
}
func main(){
	arr1:=[]int{1,2,3,4,5,6}
	fmt.Println("original array",arr1)

	arr2:=copyarray(arr1)
	fmt.Println("copy array",arr2)
}