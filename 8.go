package main
import "fmt"
type Book struct{
    BookId int
    BookTitle string
    Author string
    Price float64
}
func main(){
  var n int
  fmt.Println("enter no of book")
  fmt.Scanf("%d",&n)

  books:= make([]Book ,n)

  for i:=0;i<n;i++{
	fmt.Printf("enter book details %d\n",i+1)

	fmt.Print("book id\n")
	fmt.Scan(&books[i].BookId)

	fmt.Print("book title\n")
	fmt.Scan(&books[i].BookTitle)

	fmt.Print("book author\n")
	fmt.Scan(&books[i].Author)

	fmt.Print("book price\n")
	fmt.Scan(&books[i].Price)
  }

  fmt.Println("book details\n")
  for _,book:=range books{

  fmt.Printf("book id: %d\n book title :%s\nbook author: %s\n book price: %2f\n",book.BookId,book.BookTitle,book.Author,book.Price)

}
}