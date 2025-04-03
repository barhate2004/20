package main
import "fmt"

type shape interface{
	area() float64
	volume() float64
}

type square struct{
	side float64
}

func(s square) area() float64{
	return s.side * s.side
}
func(s square) volume() float64{
	return s.side*s.side*s.side
}

type rectangle struct{
	length float64
	width float64
	height float64
}
func(r rectangle) area() float64{
	return r.length * r.width
}
func(r rectangle) volume() float64{
	return r.length*r.width*r.height
}

func main(){
	s:=square{side:5}
	r:=rectangle{length: 3,width: 6,height: 9}

	fmt.Printf("area of square: %2f\n",s.area())
	fmt.Printf("volume of sqaure: %2f\n",s.volume())
	fmt.Printf("area of reactangle: %2f\n",r.area())
	fmt.Printf("volume of rectangle: %2f\n",r.volume())
}