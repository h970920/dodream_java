package class_50_test;

class Book {
    private int price = 20000;
    private String author = "홍길동";
    private String title = "하이~자바";
    private String publisher = "이젠";
    private String pubDate = "2023-12-02";

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    void print() {
        System.out.println("제목 = " + this.title);
        System.out.println("가격 = " + this.price);
        System.out.println("저자 = " + this.author);
        System.out.println("출판사 = " + this.publisher);
        System.out.println("출간일 = " + this.pubDate);
    }
}

public class Quiz_Book_10 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(20003);
        book.setAuthor("홍길동쓰");
        book.setPubDate("2023-12-22");
        book.setPublisher("두드림쓰");
        book.setTitle("하이하이자바");
        book.print();
    }
} // end of main
