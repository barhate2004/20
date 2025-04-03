package main
import "fmt"
type student struct{
	rollno int
	name string
	marks int
	class string
}

func (s*student)show(){
	fmt.Println("student details")
	fmt.Println("roll no ",s.rollno)
	fmt.Println("name ",s.name)
	fmt.Println("marks",s.marks)
	fmt.Println("class",s.class,"\n")
}

func main(){
	s1:=student{rollno:12,
		name:"rahul",
		marks:100,
		class:"10th"}
  s1.show()
  s2:=&student{
	rollno:123,
	name:"ketan",
	marks:99,
	class:"tybsc"}
  s2.show()
}