package main

import (
    "fmt"
    "myproject/rectangle" // Replace 'myproject' with your module name
)

func main() {
    var length, width float64

    fmt.Print("Enter length of rectangle: ")
    fmt.Scan(&length)

    fmt.Print("Enter width of rectangle: ")
    fmt.Scan(&width)

    // Calling the Area function from rectangle package
    area := rectangle.Area(length, width)
    
    fmt.Println("Area of the rectangle is:", area)
}
