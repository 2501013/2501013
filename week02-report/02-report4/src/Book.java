public class Book {
    private String title;
    private String author;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;


    }

    @Override
    public String toString() {
        return String.format("책 제목 : %s, 저자 : %s",title,author);
    }
}
