class Library {
    void libraryName() {
        System.out.println("ABC Library");
    }
}
class Book extends Library{
    void bookName() {
        System.out.println("Book Java");
    }
}
class Author extends Book{
    void authorName() {
        System.out.println("Author: James ");
    }
}

public class LibraryManagement {
    public static void main(String[] args){
        Author a = new Author();
        a.libraryName();
        a.bookName();
        a.authorName();
    }
}