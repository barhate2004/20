package main

import (
	"fmt"
	"os"
)

func appendToFile(filename string, content string) error {
	// Open the file in append mode, create it if it doesn't exist
	file, err := os.OpenFile(filename, os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	if err != nil {
		return err
	}
	defer file.Close()

	// Write the content to the file
	if _, err := file.WriteString(content + "\n"); err != nil {
		return err
	}

	return nil
}

func main() {
	filename := "example.txt"
	content := "This is a new line of text."

	err := appendToFile(filename, content)
	if err != nil {
		fmt.Println("Error appending to file:", err)
		return
	}

	fmt.Println("Content appended to", filename)
}
